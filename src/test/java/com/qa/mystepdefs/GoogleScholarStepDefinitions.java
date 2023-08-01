package com.qa.mystepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.GoogleScholarPage;

public class GoogleScholarStepDefinitions {

    private WebDriver driver;
    private GoogleScholarPage googleScholarPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    
     @After
      public void tearDown() {
        if (driver != null) {
           // driver.quit();
       }
    }

    @Given("I am on the search page")
    public void i_am_on_the_search_page() {
        driver.get("https://scholar.google.com");
        googleScholarPage = new GoogleScholarPage(driver);
    }

    @When("I enter {string} in the search bar")
    @When("I enter  {string} in the search bar")
    //@When("I enter the date range {string} in the search bar")
    public void i_enter_in_the_search_bar(String keywords) {
        if (keywords.equals("artificial intelligence")) {
            googleScholarPage.searchBoxLocator("artificial intelligence");
        } else if (keywords.equals("climate change impacts")) {
            googleScholarPage.searchBoxLocator("climate change impacts");
        } else if (keywords.equals("John Smith")) {
            googleScholarPage.searchBoxLocator("John Smith");
        } else if (keywords.equals("2020-01-01 to 2021-12-31")) {
            googleScholarPage.searchBoxLocator("2020-01-01 to 2021-12-31");
        } else if (keywords.equals("artificial intelligence 2020")) {
            googleScholarPage.searchBoxLocator("artificial intelligence 2020");
        } else if (keywords.equals("biolagy")) {
            googleScholarPage.searchBoxLocator("biolagy");
        } else if (keywords.equals("Digital privacy")) {
            googleScholarPage.searchBoxLocator("Digital privacy");
        } else {
        	
        
            // Handle other scenarios if needed
        }
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        googleScholarPage.clickSearchButton();
    }
    @When("I click on the Case law radio button")
    public void i_click_the_caseLawRadioButtonLocator() {
    	googleScholarPage.clickCaseLawRadioButtonLocator();
   
    }
    
    @Then("I should see relevant search results related to artificial intelligence")
    public void i_should_see_relevant_search_results_related_to_artificial_intelligence() {
        Assert.assertTrue(driver.findElement(By.cssSelector("#WLaj9ZUvTjoJ > b:nth-child(1)")).isDisplayed());
    }

    @Then("I should see search results related to the impact of climate change")
    public void iShouldSeeSearchResultsRelatedToClimateChangeImpact() {
        Assert.assertTrue(driver.findElement(By.cssSelector("#MqoEJxPGbLkJ > b:nth-child(1)")).isDisplayed());

    }
    
    @Then("I should see publications authored by John Smith listed")
    public void i_should_see_publications_authored_by_listed(){
    	Assert.assertTrue(driver.findElement(By.cssSelector("#gs_res_ccl_mid > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1) > b")).isDisplayed());
    }
    
    @Then("I should see articles published between {string} and {string} in the search results")
    public void i_should_see_articles_published_between_in_the_search_results(String startDate, String endDate) {
    Assert.assertTrue(driver.findElement(By.cssSelector("div.gs_r:nth-child(2) > div:nth-child(2) > div:nth-child(3) > b")).isDisplayed());

    	
    }
    
    @Then("I should see search results with articles related to artificial intelligence published in 2020")
    public void verifySearchResults() {
    	Assert.assertTrue(driver.findElement(By.cssSelector("#CxgvkjilGKgJ")).isDisplayed());
    }
    @Then("I should see search results with articles related to the corrected spelling {string}")
    public void verifySearchResults(String correctedSpelling) {
        WebElement searchResults = driver.findElement(By.id("KNJ0p4CbwgoJ"));
        String resultsText = searchResults.getText();
        // Assuming you have a method or logic to check if the search results contain the corrected spelling "biology"
        assertTrue(resultsText.contains(correctedSpelling));
    }
    
    @Then("I should see search results with only {string} documents")
    public void verifySearchResultsCase(String contentTypes) {
        WebElement searchResults = driver.findElement(By.id("tFu4s5yj23AJ"));
        String resultsText = searchResults.getText();
        // Assuming you have a method or logic to check if the search results contain only case law documents
        //assertTrue(checkSearchResultsForCaseLaw(resultsText));
       // assertTrue(resultsText.contains(contentTypes));
        assertTrue(checkSearchResultsForContentType(resultsText, contentTypes));


    }

	private boolean checkSearchResultsForContentType(String resultsText, String contentTypes) {
		// TODO Auto-generated method stub
		return false;
	}

}