package ph.com.bprompt.datasource.payroll.controller;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;

import com.google.inject.Inject;
import com.google.inject.Injector;

//public final class GuiceFXMLLoader {
//
//	/**
//	 * Guice Injector that will be used to fetch an instance of our `controller
//	 * class`.
//	 */
//	private final Injector injector;
//
//	@Inject
//	public GuiceFXMLLoader(final Injector injector) {
//		super();
//		this.injector = injector;
//	}
//
//	/**
//	 * Loads an object hierarchy from a FXML document
//	 * <p>A simple wrapper around the
//	 * {@link FXMLLoader#load(URL, ResourceBundle) load method}
//	 * of JavaFX' FXMLLoader class that adds a tiny notch of Guice-related
//	 * magic.</p>
//	 * 
//	 * @param url
//	 *             URL of the FXML resource to be loaded
//	 * @param resources	Resources to be used to populate
//	 * @return	The loaded object hierarchy
//	 * @throws IOException
//	 * @see {@link FXMLLoader#load(URL, ResourceBundle)}
//	 */
//	public <N> N load(final URL url, final ResourceBundle resources) throws IOException {
//
//		final FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(url);
//		loader.setResources(resources);
//		loader.setControllerFactory(new Callback<Class<?>, Object>() {
//			@Override
//			public Object call(Class<?> param) {
//				return injector.getInstance(param);
//			}
//		});
//
//		@SuppressWarnings("unchecked")
//		final N value = (N) loader.load(url.openStream());
//		return value;
//
//	}
//
//}
/**
 * Uses Guice to inject model state. Basically you create an instance of
 * GuiceFXMLLoader supplying an Injector, and then call load. The load
 * method takes the FXML file to load, and the controller to create and
 * associate with the FXML file.
 */
public class GuiceFXMLLoader {
    private final Injector injector;
    
    @Inject 
    public GuiceFXMLLoader(Injector injector) {
        this.injector = injector;
    }
    
    // Load some FXML file, using the supplied Controller, and return the
    // instance of the initialized controller...?
    public Object load(Class<?> controller) {
    	InputStream in = null;
        URL u = null;
        String templateName = null;
        
    	Object instance = injector.getInstance(controller);
        FXMLLoader loader = new FXMLLoader();
        
        loader.getNamespace().put("controller", instance);
        
        try {
            try {
                Annotation a = controller.getAnnotation(ViewTemplate.class);
                
                if (a instanceof ViewTemplate) {
                	templateName = ((ViewTemplate) a).value();
                } else {
                	templateName = controller.getSimpleName().replace("Controller", "View.fxml");
                }
                
                u = new URL(templateName);
            	in = u.openStream();
            	
            } catch (Exception e) {
                in = controller.getResourceAsStream(templateName);
            }
            return loader.load(in);
        } catch (Exception e) {
        	Logger.getLogger(GuiceFXMLLoader.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (in != null) try { in.close(); } catch (Exception ee) { }
        }
        return null;
    }
}