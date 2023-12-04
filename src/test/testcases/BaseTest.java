package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.FirstPage;

import utils.Constants;

public class BaseTest {
    protected WebDriver driver;
    protected FirstPage firstPage;

    @BeforeMethod
    public void setUp() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.baseURL);

        firstPage = new FirstPage(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
