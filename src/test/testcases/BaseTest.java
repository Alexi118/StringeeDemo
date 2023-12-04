package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.FirstPage;

import utils.Constants;

public class BaseTest {
    protected WebDriver driver;
    protected FirstPage firstPage;
    @Parameters({"browserName"})
    @BeforeMethod
    public void setUp(String browserName) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get(Constants.baseURL);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
