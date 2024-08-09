package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
    public By Deleteiconpro1= new By.ByCssSelector("div[id='js--cart-product-item-123410'] img[alt='trash']");
    public By DeleteConpro2=new By.ByCssSelector("div[id='js--cart-product-item-388418'] img[alt='trash']");
    public By DeleteYes= By.xpath("//button[contains(text(),'হ্যাঁ')]");
    public By AddBook= new By.ByCssSelector("button[id='js--btn-plus-351921'] i[class='ion-ios-plus-empty']");
    public By SubBook= new By.ByCssSelector("button[id='js--btn-minus-351921'] i[class='ion-ios-minus-empty']");
    public By ProceedToPay=By.xpath("//span[normalize-space()='Proceed to Check Out']");
    public By Engerphone=By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By AlternativeNum= new By.ByCssSelector("body > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(14) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > fieldset:nth-child(2) > input:nth-child(1)");
    public By SelectCity=By.xpath("//select[@id='js--city']");
    public By AreaSelect= By.xpath("//select[@id='js--area']");
    public By Address=By.xpath("//textarea[@id='address']");
    public By COD=By.xpath("//label[@for='COD']");
 public By BkashPay=By.xpath("//label[@for='B_KASH']");
public By NagadPay=By.xpath("//label[@for='NAGAD']");
public By Rocket=By.xpath("//label[@for='ROCKET']");
public By Cardpay=By.xpath("//label[@for='SSL_COMMEREZ']");
public By Terms=By.xpath("//label[contains(text(),'রকমারির শর্তাবলীতে সম্মতি প্রদান করছি ৷')]");
public By Placeorder=By.xpath("//button[@id='place_order']");

}


