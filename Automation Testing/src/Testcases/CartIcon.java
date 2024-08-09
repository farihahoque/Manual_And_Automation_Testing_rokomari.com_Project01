package Testcases;

import Pages.CartPage;
import Pages.HomePage;
import Pages.HumayunAhmedAuthor;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CartIcon extends DriverSetup {

    HomePage homePage=new HomePage();
    LoginPage SignUp = new LoginPage();
    HumayunAhmedAuthor humayunpage=new HumayunAhmedAuthor();
    CartPage cartPage=new CartPage();
    @BeforeMethod
    public void SignUpAndAddBook() {

        SignUp.navigateToLoginPage();
        SignUp.clickOnElement(SignUp.Google_Button);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.SignInEmail)).sendKeys("farihahoque1610@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.NextSignIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.PasswordSignIn)).sendKeys("Farihahoque123");
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.NextPassword)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.RokomariLogo)).click();

        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.AuthorList));
        Actions actions=new Actions(getDriver());
        actions.moveToElement(element).perform();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.HumayunAhmed)).click();
        actions.scrollByAmount(0, 300).build().perform();
        WebElement addbook= wait.until(ExpectedConditions.elementToBeClickable(humayunpage.HumayunBook));
        actions.moveToElement(addbook).perform();
        WebElement addbooktocart= wait.until(ExpectedConditions.elementToBeClickable(humayunpage.Addbooktocart));
        actions.click(addbooktocart).perform();

    }
    @Test
    public void TestClickToCartIconandGoToShippingPage(){


        Actions actions=new Actions(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement ClickCart= wait.until(ExpectedConditions.elementToBeClickable(homePage.CartIcon));
        actions.doubleClick(ClickCart).perform();

    }
    @Test
    public void TestDelete(){
        Actions actions=new Actions(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement ClickCart= wait.until(ExpectedConditions.elementToBeClickable(homePage.CartIcon));
        actions.doubleClick(ClickCart).perform();
        WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(cartPage.Deleteiconpro1));
        actions.doubleClick(element1).perform();
        WebElement element2= wait.until(ExpectedConditions.elementToBeClickable(cartPage.DeleteYes));
        actions.click(element2).perform();


    }
    @Test
    public void TestMultipleProductDelete(){
        Actions actions=new Actions(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement ClickCart= wait.until(ExpectedConditions.elementToBeClickable(homePage.CartIcon));
        actions.doubleClick(ClickCart).perform();
        WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(cartPage.Deleteiconpro1));
        actions.doubleClick(element1).perform();
        WebElement element2= wait.until(ExpectedConditions.elementToBeClickable(cartPage.DeleteYes));
        actions.click(element2).perform();
        WebElement element3= wait.until(ExpectedConditions.elementToBeClickable(cartPage.DeleteConpro2));
        actions.doubleClick(element3).perform();
        WebElement element4= wait.until(ExpectedConditions.elementToBeClickable(cartPage.DeleteYes));
        actions.click(element4).perform();


    }

    @Test
    public void TestAddBook(){
        Actions actions=new Actions(getDriver());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement ClickCart= wait.until(ExpectedConditions.elementToBeClickable(homePage.CartIcon));
        actions.doubleClick(ClickCart).perform();
        //Add product
        WebElement addbook= wait.until(ExpectedConditions.elementToBeClickable(cartPage.AddBook));
        actions.doubleClick(addbook).perform();
        //Subtract product
        WebElement Subbook= wait.until(ExpectedConditions.elementToBeClickable(cartPage.SubBook));
        actions.click(Subbook).perform();

    }


}
