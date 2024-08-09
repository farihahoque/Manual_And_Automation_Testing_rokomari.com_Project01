package Testcases;

import Pages.HomePage;
import Pages.HumayunAhmedAuthor;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCart extends DriverSetup {
HomePage homePage=new HomePage();
HumayunAhmedAuthor humayunpage=new HumayunAhmedAuthor();
LoginPage SignUp = new LoginPage();

    @BeforeMethod
    public void loadPage() {

        homePage.loadHomePage();


    }

    @Test
     public void TestAddBookToCart(){
     humayunpage.clickOnElement(humayunpage.Addbooktocart);
     }

}
