package ph.com.bprompt.datasource.payroll.controller;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 
 * @author Edwin
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface ViewTemplate {
	/**
	 * @return the fxml file binded to the controller 
	 */
	String value();
}
