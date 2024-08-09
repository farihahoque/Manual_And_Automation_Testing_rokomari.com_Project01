package Testcases;

import Pages.BasePage;
import Pages.HomePage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static Pages.BasePage.loadAWebPage;

public class SelectWriter extends DriverSetup {

    HomePage homePage = new HomePage();

    @BeforeMethod
    public void loadPage() {

        HomePage.loadHomePage();
    }
    @Test
    public void GotoWriterSection() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.Adhomepage)).click();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.AuthorList)).click();

    }


}


