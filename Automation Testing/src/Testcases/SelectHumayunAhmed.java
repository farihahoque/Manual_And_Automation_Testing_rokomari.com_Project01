package Testcases;

import Pages.HomePage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectHumayunAhmed extends DriverSetup {
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void loadPage() {

        HomePage.loadHomePage();
    }
    @Test
    public void hovertoHumayunAhmed() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.Adhomepage)).click();

        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.AuthorList));
        Actions actions=new Actions(getDriver());
        actions.moveToElement(element).perform();

        wait.until(ExpectedConditions.elementToBeClickable(homePage.HumayunAhmed)).click();


    }
    }
