package feature.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Singleton class used to instantiate a single instance of a {@link WebDriver}
 * to be used by Cucumber classes.
 */
public class Browser {

	private static WebDriver instance;

	/**
	 * Add a JVM shutdown hook to ensure the browser closes when the JVM does so we don't
	 * litter the place with browser instances!
	 */
	static {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				Browser.close();
			}
		});
	}

	/**
	 * @return the single instance of {@link WebDriver}, will lazy load if necessary
	 */
	public static WebDriver getWebDriver() {
		if (instance == null) {
			instance = new FirefoxDriver();
		}
		return instance;
	}

	/**
	 * Closes the {@link WebDriver} instance / browser session
	 */
	public static void close() {
		if (instance != null) {
			instance.close();
			instance = null;
		}
	}
}
