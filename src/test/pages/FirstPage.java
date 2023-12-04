package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends BasePage{
    public FirstPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "")
    public WebElement firstElement;
}
