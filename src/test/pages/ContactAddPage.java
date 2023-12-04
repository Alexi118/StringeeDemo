package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactAddPage extends BasePage{
    public ContactAddPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[name=\"name\"]")
    public WebElement name_txt;
    @FindBy(css = "input[name=\"email\"]")
    public WebElement email_txt;
    @FindBy(css = "input[name=\"phone\"]")
    public WebElement phone_txt;
    @FindBy(css = "button[type=\"submit\"]")
    public WebElement addAContact_btn;

    public void action_AddAContacts(){
        name_txt.sendKeys("Cuong");
        email_txt.sendKeys("cuong@gmail.com");
        phone_txt.sendKeys("12345678");
        addAContact_btn.click();
    }
}
