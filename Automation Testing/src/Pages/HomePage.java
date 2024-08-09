package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public static String homepageUrl = "https://www.rokomari.com/book";

    public static By Signin_button =By.xpath("//a[normalize-space()='Sign in']");
    public By LoggedAccountUsername=By.xpath("//span[@class='user-name']");
    public By Adhomepage=By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");

    public By AuthorList=By.xpath("//a[@id='js--authors']");
    public By AuthorListdropdown=By.xpath("//a[contains(text(),'লেখক')]//i[@class='fa fa-angle-down']");
    public By HumayunAhmed=By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By NewBook=By.xpath("//section[@class='home-book-list-section']//div[@class='book-list-wrapper slick-slide slick-active']//div[1]//div[2]//button[1]");
    public By CartIcon=By.xpath("//img[@alt='cart']");





    public static void loadHomePage(){

        loadAWebPage(homepageUrl);
    }


}
