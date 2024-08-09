package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage {
    public By Signin_button =By.xpath("//a[normalize-space()='Sign in']");
    public By Google_Button =By.xpath("//button[normalize-space()='Google']");
    public By LoginorSignup= By.xpath("//p[@class='active js--login-form-btn text-uppercase']");
    public By SignInAccount=By.xpath("//span[normalize-space()='Sign in']");
    public By EmailorPhoneBox= By.xpath("//input[@id='identifierId']");
    public By LoginButton=By.xpath("//span[normalize-space()='Next']");
    public By EmailErrMsg= new By.ByCssSelector(".Ekjuhf.Jj6Lae");
    public By CreateAnAccount=By.xpath("//span[normalize-space()='Create account']");
    public By RokomariLogo= By.xpath("//img[@alt='Rokomari logo']");
    public By SignInEmail= By.xpath("//input[@id='identifierId']");
    public By NextSignIn=By.xpath("//span[normalize-space()='Next']");
    public By PasswordSignIn=By.xpath("//input[@name='Passwd']");
    public By NextPassword=By.xpath("//span[normalize-space()='Next']");
    public By TryAnotherWay=By.xpath("//span[normalize-space()='Try another way']");

    public By Homepagedropdown= By.xpath("//i[@class='ion-arrow-down-b']");
    public By DropDownSignOut=By.xpath("//a[normalize-space()='Sign Out']");
    public By Errormsg=By.xpath("//span[contains(text(),'Wrong password. Try again or click Forgot password')]");

    HomePage homePage= new HomePage();
    public void navigateToLoginPage(){
        homePage.loadHomePage();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.Signin_button)).click();

    }
}
