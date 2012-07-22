package ph.com.bprompt.datasource.payroll;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ph.com.bprompt.datasource.payroll.controller.GuiceFXMLLoader;
import ph.com.bprompt.datasource.payroll.controller.PayrollModule;
import ph.com.bprompt.datasource.payroll.controller.SampleController;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * A Guice based sample FXML Application
 */
public class PayrollApplication extends Application {
    /**
     * Create the Guice Injector, which is going to be used to supply
     * the Person model.
     */
    private final Injector injector = Guice.createInjector(new PayrollModule());
    
    @Override 
    public void start(Stage stage) throws Exception {
        // Create a new Guice-based FXML Loader
        GuiceFXMLLoader loader = injector.getInstance(GuiceFXMLLoader.class);
        // Ask to load the Sample.fxml file, injecting an instance of a SampleController
        Parent root = (Parent) loader.load(SampleController.class);
        
        // Finish constructing the scene
        final Scene scene = new Scene(root, 320, 240);
        // Load up the CSS stylesheet
        //scene.getStylesheets().add(getClass().getResource("fxmlapp.css").toString());
        // Show the window
        stage.setScene(scene);
        stage.setTitle("Guiced");
        stage.show();
    }

    // Standard launcher
    public static void main(String[] args) {
        launch(args);
    }
}