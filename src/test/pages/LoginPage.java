package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "input[name=\"email\"]")
    public WebElement email_txt;

    @FindBy (css = "input[name=\"password\"]")
    public WebElement pass_txt;

    @FindBy (css = "form button")
    public WebElement signIn_Btn;

    public void action_logInWithCorrectUser(){
        email_txt.clear();
        email_txt.sendKeys("user@stringee.com");
        pass_txt.clear();
        pass_txt.sendKeys("12341234");
        signIn_Btn.click();
    }
}
