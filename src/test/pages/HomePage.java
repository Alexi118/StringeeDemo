package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href=\"/contact\"]")
    public WebElement contact_button;

    public void action_clickOn_Contacts(){
        contact_button.click();
    }
}
