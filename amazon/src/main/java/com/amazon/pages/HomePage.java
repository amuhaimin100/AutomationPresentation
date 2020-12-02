package com.amazon.pages;


import com.base.TestBase;
import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(id = "nav-logo-sprites")
    private WebElement logoButton;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement menuButton;

    @FindBy(xpath = "(//a[text()='New Releases'])[2]")
    private WebElement newReleasesButton;

    @FindBy(xpath = "//span[text()= 'Account & Lists']")
    private WebElement accountAndListsButton;

    @FindBy(xpath = "//span[text()='Register for a Business Account']")
    private WebElement businessAccountButton;

    @FindBy(xpath = "//span[text()='Orders']")
    private WebElement ordersButton;

    @FindBy(xpath = "//input[@aria-label= 'Search']")
    private WebElement searchBar;

    @FindBy(id = "searchDropdownBox")
    private WebElement departmentsDropDown;

    @FindBy(xpath = "//span[@aria-label='Go']")
    private WebElement searchButton;

    public void refreshHomePage() {
        driver.navigate().refresh();
        ExtentTestManager.log("User Refreshed the homepage");
    }

    public void validateClickOnLogo() {
        logoButton.click();
        Assert.assertTrue(logoButton.isDisplayed());
        ExtentTestManager.log("Clicked on and validated Amazon Logo button");
    }

    public void clickOnMenuButton() {
        menuButton.click();
        ExtentTestManager.log("Clicked On Menu Button");
    }

    public void clickOnNewReleasesButton() {
        newReleasesButton.click();
        ExtentTestManager.log("Clicked On New Releases from Menu");
    }

    public void validateNewReleaseURL() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/gp/new-releases";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for New Releases " + actualURL);
    }

    public void hoverOverAccountAndLists() {
        Actions actions = new Actions(driver);
        actions.moveToElement(accountAndListsButton).build().perform();
        ExtentTestManager.log("Hovered over account and lists");
    }

    public void clickOnBusinessAccountButton() {
        accountAndListsButton.click();
        ExtentTestManager.log("Clicked On create Business Account button");
    }

    public void validateURLForAmazonBusiness() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://business.amazon.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Amazon Business");
    }

    public void clickOnOrdersButton() {
        ordersButton.click();
        ExtentTestManager.log("Clicked On Orders Button from Account And Lists Dropdown");
    }

    public void validateURLForSignInPage() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for Sign In Page " + actualURL);
    }

    public void typeOnSearchBar() {
        searchBar.sendKeys("PlayStation5");
        ExtentTestManager.log("Typed on searchbar");
    }

    public void clickOnDepartmentDropdownAndSelectVideoGames() {
        Select select = new Select(departmentsDropDown);
        select.selectByVisibleText("Video Games");
        ExtentTestManager.log("Selected Video games from department dropdown box");
    }

    public void clickOnSearchButton() {
        searchButton.click();
        ExtentTestManager.log("Clicked on search button");
    }

    public void validateURLForProductSearch() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/s?k=PlayStation5";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Validated URL for product search " + actualURL);
    }

    public void typeMultipleDataOnSearchBar(String data) {
        searchBar.sendKeys(data);
        ExtentTestManager.log("Typed on Search bar " + data);
    }

}
