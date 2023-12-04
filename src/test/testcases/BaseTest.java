package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContactAddPage;
import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;

import utils.Constants;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait waitFor;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ContactPage contactPage;
    protected ContactAddPage contactAddPage;

    @BeforeMethod
    public void setUp() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.baseURL);

        waitFor = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        contactPage= new ContactPage(driver);
        contactAddPage = new ContactAddPage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
