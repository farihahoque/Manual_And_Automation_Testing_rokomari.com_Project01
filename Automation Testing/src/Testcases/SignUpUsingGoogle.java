package Testcases;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpUsingGoogle extends DriverSetup {
    LoginPage SignUp = new LoginPage();


    @BeforeMethod
    public void loadPage() {

        SignUp.navigateToLoginPage();
    }

    @Test
    public void GoogleButtonIsPresent() {
        Assert.assertTrue(SignUp.getDisplayStatus(SignUp.Google_Button));

    }

    @Test
    public void LoginOrSignUpButtonIsPresent() {

        Assert.assertTrue(SignUp.getDisplayStatus(SignUp.LoginorSignup));
    }

    @Test
    public void DifferentPageOpenByPressingGoogleButton() {
        SignUp.clickOnElement(SignUp.Google_Button);
        Assert.assertTrue(SignUp.getDisplayStatus(SignUp.SignInAccount));

    }

    @Test
    public void EmailorPhoneCanbeUsedtoSignUp() {
        SignUp.clickOnElement(SignUp.Google_Button);
        Assert.assertTrue(SignUp.getDisplayStatus(SignUp.EmailorPhoneBox));

    }

    @Test
    public void ValidEmailcanbeUsedAsInput() {
        SignUp.clickOnElement(SignUp.Google_Button);
        SignUp.writeOnElement(SignUp.EmailorPhoneBox, "b2soplm7lw@hellomailo.net");
        SignUp.clickOnElement(SignUp.LoginButton);

    }

    @Test
    public void ErrorMsgifNotRegistered() {
        SignUp.clickOnElement(SignUp.Google_Button);
        SignUp.writeOnElement(SignUp.EmailorPhoneBox, "b2soplm7lw@hellomailo.net");
        SignUp.clickOnElement(SignUp.LoginButton);
        Assert.assertEquals(SignUp.getElementText(SignUp.EmailErrMsg), "Couldn’t find your Google Account");

    }

    @Test
    public void CreateAnAccountIsClickableornot() {
        SignUp.clickOnElement(SignUp.Google_Button);
        SignUp.clickOnElement(SignUp.CreateAnAccount);


    }
    @Test
    public void TestTryAnotherWay() {
        SignUp.clickOnElement(SignUp.Google_Button);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.SignInEmail)).sendKeys("farihahoque1610@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.NextSignIn)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.TryAnotherWay));
    }

    @Test
    public void TestErrMsg(){
        SignUp.clickOnElement(SignUp.Google_Button);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.SignInEmail)).sendKeys("farihahoque1610@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.NextSignIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.PasswordSignIn)).sendKeys("Farihaue12");
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.NextPassword)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.Errormsg));
        Assert.assertEquals(SignUp.getElementText(SignUp.Errormsg),"Wrong password. Try again or click Forgot password");
    }

    @Test
    public void SignInWithGoogle() {
        SignUp.clickOnElement(SignUp.Google_Button);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.SignInEmail)).sendKeys("farihahoque1610@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.NextSignIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.PasswordSignIn)).sendKeys("Farihahoque123");
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.NextPassword)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.RokomariLogo)).click();
    }

    @Test
    public void SignOutButtonIsPresent() {
        SignUp.clickOnElement(SignUp.Google_Button);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.SignInEmail)).sendKeys("farihahoque1610@gmail.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(SignUp.NextSignIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.PasswordSignIn)).sendKeys("Farihahoque123");
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.NextPassword)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.Homepagedropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignUp.DropDownSignOut)).click();

    }
}





