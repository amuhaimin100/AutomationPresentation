package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test(enabled = false)
    public void validateUserIsAbleToRefreshHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.refreshHomePage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnAmazonLogo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateClickOnLogo();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnMenuAndThenNewReleases() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMenuButton();
        homePage.clickOnNewReleasesButton();
        homePage.validateNewReleaseURL();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnBusinessAccountFromAccountAndLists() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverAccountAndLists();
        homePage.clickOnBusinessAccountButton();
        homePage.validateURLForAmazonBusiness();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToClickOnOrdersAndNavigateToSignInPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverAccountAndLists();
        homePage.clickOnOrdersButton();
        homePage.validateURLForSignInPage();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToSelectDepartmentTypeOnTheSearchBarAndClickSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
        homePage.clickOnDepartmentDropdownAndSelectVideoGames();
        homePage.clickOnSearchButton();
        homePage.validateURLForProductSearch();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData")
    public void validateUserIsBeingAbleToSearchForMultipleItems(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeMultipleDataOnSearchBar(data);
        homePage.clickOnSearchButton();
    }


}

