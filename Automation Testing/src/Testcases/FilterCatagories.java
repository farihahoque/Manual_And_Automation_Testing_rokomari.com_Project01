package Testcases;

import Pages.HomePage;
import Pages.HumayunAhmedAuthor;
import Utilities.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FilterCatagories extends DriverSetup {

    HomePage homePage=new HomePage();
    HumayunAhmedAuthor humayunPage=new HumayunAhmedAuthor();

@BeforeMethod
    public void Page() {

        homePage.loadHomePage();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.Adhomepage)).click();
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(homePage.AuthorList));
        Actions actions=new Actions(getDriver());
        actions.moveToElement(element).perform();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.HumayunAhmed)).click();
    }



    @Test
    public void FilterCatagories(){

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(200));
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 200).build().perform();
        WebElement filter1= wait.until(ExpectedConditions.elementToBeClickable(humayunPage.HumayunFilterContemporaryNovel));
        actions.doubleClick(filter1).perform();
        actions.click(filter1).perform();
        wait.until(ExpectedConditions.urlToBe("https://www.rokomari.com/book/author/1/humayun-ahmed?xyz=&categoryIds=677&priceRange=0to45100&discountRange=0to40"));

        actions.scrollByAmount(0, 600).build().perform();
        WebElement filter2= wait.until(ExpectedConditions.elementToBeClickable(humayunPage.HumayunRochonaSomogro));
        actions.moveToElement(filter2);
        actions.doubleClick(filter2).perform();
        actions.click(filter2).perform();

        // next page is not present so this step is not executed


    }


}
