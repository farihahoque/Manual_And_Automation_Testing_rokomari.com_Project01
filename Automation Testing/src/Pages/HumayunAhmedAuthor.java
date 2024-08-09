package Pages;

import org.openqa.selenium.By;


public class HumayunAhmedAuthor extends BasePage {
    public By HumayunAhmed=By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

    public By HumayunFilterContemporaryNovel= new By.ByCssSelector("div[data-search-key='সমকালীন উপন্যাস Contemporary Novel ']");
    public By HumayunRochonaSomogro= new By.ByCssSelector("div[data-search-key='রচনা সংকলন ও সমগ্র Literature Collection']");
    public  By HumayunBook=By.xpath("//div[@title='হুমায়ূন আহমেদ রচনাবলী ৯ হুমায়ূন আহমেদ']//div[@class='book-list-wrapper ']");
    public By Addbooktocart= By.xpath("//div[@title='হুমায়ূন আহমেদ রচনাবলী ৯ হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");
    public By GoToCart=By.xpath("//a[contains(@class,'btn details-cart-btn-new small-cart-button js--goto-cart-btn js--details-service-message-ab-test')]//span[contains(text(),'Go To Cart')]");

}
