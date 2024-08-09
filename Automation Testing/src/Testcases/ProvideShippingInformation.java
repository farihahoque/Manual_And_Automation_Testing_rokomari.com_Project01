package Testcases;

import Pages.CartPage;
import Pages.HomePage;
import Pages.HumayunAhmedAuthor;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProvideShippingInformation extends DriverSetup {
    HomePage homePage=new HomePage();
    LoginPage SignUp = new LoginPage();
    HumayunAhmedAuthor Humayunpage=new HumayunAhmedAuthor();
    CartPage cartPage=new CartPage();
    @BeforeMethod
    public void GoToShippingPage() {


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
        WebElement addbook= wait.until(ExpectedConditions.elementToBeClickable(Humayunpage.HumayunBook));
        actions.moveToElement(addbook).perform();
        WebElement addbooktocart= wait.until(ExpectedConditions.elementToBeClickable(Humayunpage.Addbooktocart));
        actions.click(addbooktocart).perform();
        WebElement ClickCart= wait.until(ExpectedConditions.elementToBeClickable(homePage.CartIcon));
        actions.doubleClick(ClickCart).perform();
        cartPage.clickOnElement(cartPage.ProceedToPay);


    }
    @Test
    public void TestWithCashOnDeliveryPaymentSystem() {

        cartPage.writeOnElement(cartPage.Engerphone, "01734645789");
        cartPage.writeOnElement(cartPage.AlternativeNum, "02975236789");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CitySeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.SelectCity));

        Select select = new Select(CitySeclect);
        select.selectByVisibleText("ঢাকা");
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        WebElement AreaSeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.AreaSelect));
        Select area = new Select(AreaSeclect);
        area.selectByVisibleText("ধানমন্ডি-৩২");
        cartPage.writeOnElement(cartPage.Address, "597,road 3,dhanmondi 32");
        WebElement Codpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.AreaSelect));
        actions.doubleClick(Codpay).perform();

    }

        @Test
        public void TestWithMobileWallet () {

            cartPage.writeOnElement(cartPage.Engerphone, "01734645789");
            cartPage.writeOnElement(cartPage.AlternativeNum, "02975236789");
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
            WebElement CitySeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.SelectCity));

            Select select = new Select(CitySeclect);
            select.selectByVisibleText("ঢাকা");
            Actions actions = new Actions(getDriver());
            actions.scrollByAmount(0, 300).build().perform();
            WebElement AreaSeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.AreaSelect));
            Select area = new Select(AreaSeclect);
            area.selectByVisibleText("ধানমন্ডি-৩২");
            cartPage.writeOnElement(cartPage.Address, "597,road 3,dhanmondi 32");
            actions.scrollByAmount(0, 300).build().perform();
            //WebElement Bkashpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.BkashPay));
           // actions.doubleClick(Bkashpay).perform();

            //WebElement Nagadpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.NagadPay));
            //actions.doubleClick(Nagadpay).perform();
            WebElement Rocketpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.Rocket));
            actions.doubleClick(Rocketpay).perform();

        }
    @Test
    public void TestwithCardPay() {
        cartPage.writeOnElement(cartPage.Engerphone, "01734645789");
        cartPage.writeOnElement(cartPage.AlternativeNum, "02975236789");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CitySeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.SelectCity));

        Select select = new Select(CitySeclect);
        select.selectByVisibleText("ঢাকা");
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        WebElement AreaSeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.AreaSelect));
        Select area = new Select(AreaSeclect);
        area.selectByVisibleText("ধানমন্ডি-৩২");
        cartPage.writeOnElement(cartPage.Address, "597,road 3,dhanmondi 32");
        actions.scrollByAmount(0, 600).build().perform();
        WebElement Cardpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.Cardpay));
        actions.doubleClick(Cardpay).perform();
    }
    @Test
    public void TestIfCheckBoxIsClicked() {
        cartPage.writeOnElement(cartPage.Engerphone, "01734645789");
        cartPage.writeOnElement(cartPage.AlternativeNum, "02975236789");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement CitySeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.SelectCity));

        Select select = new Select(CitySeclect);
        select.selectByVisibleText("ঢাকা");
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(0, 300).build().perform();
        WebElement AreaSeclect = wait.until(ExpectedConditions.elementToBeClickable(cartPage.AreaSelect));
        Select area = new Select(AreaSeclect);
        area.selectByVisibleText("ধানমন্ডি-৩২");
        cartPage.writeOnElement(cartPage.Address, "597,road 3,dhanmondi 32");
        actions.scrollByAmount(0, 600).build().perform();
        WebElement Cardpay = wait.until(ExpectedConditions.elementToBeClickable(cartPage.Cardpay));
        actions.doubleClick(Cardpay).perform();
        actions.scrollByAmount(0, 400).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(cartPage.Terms)).isSelected();

    }

    @AfterMethod
    public void TestLogout(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.Homepagedropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.DropDownSignOut)).click();
    }


    }

