package feature.google;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step definitions to perform Google searches using Selenium.
 */
public class SearchResultsSteps {
	
	private static final String GOOGLE_URL = "https://google.com";
	
	private static WebDriver webDriver;
	
	@Before("@browser")
	public static void setupBrowser() {
		webDriver = Browser.getWebDriver();
	}
	
	@Given("I'm on the Google home page")
	public void i_m_on_the_Google_home_page() {
		webDriver.get(GOOGLE_URL);
	}

	@Given("I enter '(.+)' as search criteria")
	public void i_enter_as_search_criteria(String criteria) {
	    WebElement input = webDriver.findElement(By.name("q"));
	    input.sendKeys(criteria);
	}

	@When("I perform the search")
	public void i_perform_the_search() throws InterruptedException {
		WebElement input = webDriver.findElement(By.name("q"));
		input.submit();
		Thread.sleep(5000);
	}

	@Then("I see the text '(.+)' in the first search result")
	public void i_see_The_Hartford_web_site_as_the_first_listing_in_the_search_results(String text) {
		List<WebElement> elements = webDriver.findElements(By.cssSelector("div#search div.g"));
		assertTrue(elements.size() > 0);
		WebElement firstResult = elements.get(0);
		assertTrue(firstResult.getText().contains(text));
	}


}
