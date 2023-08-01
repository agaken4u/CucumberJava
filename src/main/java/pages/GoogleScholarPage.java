package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleScholarPage{
	
	
    private WebDriver driver;

    // Locators
    
    private By searchBoxLocator = By.xpath("//*[@id=\"gs_hdr_tsi\"]");
    private By searchButtonLocator = By.xpath("/html/body/div/div[7]/div[1]/div[2]/form/button/span/span[1]");
    private By caseLawRadioButtonLocator = By.id("gs_hp_sdt2");
    private By clickGoogleScholarBreadcrumb = By.xpath("/html/body/div/div[7]/a[1]/span[1]");
    private By iClickAdvancedSearch = By.xpath("/html/body/div/div[6]/div/div[2]/div[2]/a/span[3]");
    private By enterWithAllOfTheWords =By.xpath("//*[@id=\"gs_asd_q\"]");
    private By enterWithTheExactPhrase = By.xpath("//*[@id=\"gs_asd_epq\"]");
    private By iEnterWithAtLeastOneOfTheWords = By.xpath("//*[@id=\"gs_asd_oq\"]");
    private By withOutThewords = By.xpath("//*[@id=\"gs_asd_eq\"]");
    private By clickWhereMyWordsOccur = By.xpath("//*[@id=\"gs_asd_occt_a\"]");
    // private By emailInputLocator = By.name("email");
    //private By passwordInputLocator = By.name("password");
    //private By loginButtonLocator = By.xpath("//input[@type='submit']");
   // private By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
    //private By logoutLinkLocator = By.linkText("Logout");
	
    // Constructor
    public GoogleScholarPage (WebDriver driver) {
    	this.driver = driver;
    }
    
 // Methods
    public void searchBoxLocator (String search ) {
    	WebElement searchInput = driver.findElement(searchBoxLocator);
    	searchInput.sendKeys(search);
    }
    
    public void clickSearchButton() {
    	WebElement searchButton = driver.findElement(searchButtonLocator);
    	searchButton.click();
    }
    
    public void clickCaseLawRadioButtonLocator() {
    	WebElement caseLawRadioButton = driver.findElement(caseLawRadioButtonLocator);
    	caseLawRadioButton.click();
    }
    
    public void clickGoogleScholarBreadcrumb() {
    	WebElement iClickGoogleScholarBreadcrumb = driver.findElement(clickGoogleScholarBreadcrumb);
    	iClickGoogleScholarBreadcrumb.click();
    }
    
    public void iClickAdvancedSearch () {
    	WebElement wheniClickAdvancedSearch = driver.findElement(iClickAdvancedSearch);
    	wheniClickAdvancedSearch.click();
    }
    public void enterWithAllOfTheWords(String search) {
    	WebElement iEnterWithAllOfTheWords = driver.findElement(enterWithAllOfTheWords);
    	iEnterWithAllOfTheWords.sendKeys(search);
    }
    public void enterWithTheExactPhrase(String search) {
    	WebElement iEnterWithTheExactPhrase = driver.findElement(enterWithTheExactPhrase);
    	iEnterWithTheExactPhrase.sendKeys(search);		
    }
    public void iEnterWithAtLeastOneOfTheWords(String search) {
        WebElement EnterWithAtLeastOneOfTheWords = driver.findElement(iEnterWithAtLeastOneOfTheWords);
        EnterWithAtLeastOneOfTheWords.sendKeys(search);
    }
    public void withOutThewords (String search) {
    	WebElement EnterwithOutThewords =driver.findElement(withOutThewords);
    	EnterwithOutThewords.sendKeys(search);

    }
    public void clickWhereMyWordsOccur () {
    	WebElement WhenIclickWhereMyWordsOccur = driver.findElement(clickWhereMyWordsOccur);
    	WhenIclickWhereMyWordsOccur.click();
    }

    
    
    
    
    
}
