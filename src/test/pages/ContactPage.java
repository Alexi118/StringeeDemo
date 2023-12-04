package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPage extends BasePage{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href=\"/contact/add\"]")
    public WebElement add_contact_button;
    @FindBy(css = "#contactsContent tr:nth-child(1) td:nth-child(2) b")
    public WebElement firstContact_InList;
    @FindBy(css = "#contactsContent tr td:nth-child(2) b")
    public List<WebElement> table;
    @FindBy(css="input[placeholder=\"Search by name, phone, email...\"]")
    public WebElement input;

    public void action_clickOn_AddContacts(){
        add_contact_button.click();
    }
}
