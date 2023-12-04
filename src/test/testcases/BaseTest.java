package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.FirstPage;

import utils.Constants;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait waitFor;
    protected FirstPage firstPage;

    @BeforeMethod
    public void setUp() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.baseURL);

        waitFor = new WebDriverWait(driver, Duration.ofSeconds(10));
        firstPage = new FirstPage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
