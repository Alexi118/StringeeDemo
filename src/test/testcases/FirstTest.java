package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{
//    @Test
//    public void FirstTestCase(){
//        waitFor.until(ExpectedConditions.visibilityOf(loginPage.email_txt));
//        loginPage.action_logInWithCorrectUser();
//        waitFor.until(ExpectedConditions.urlMatches("https://automation-str.stringeex.com/dashboard/callin"));
//    }

    @Test
    public void SecondTestCase() throws InterruptedException {
        loginPage.action_logInWithCorrectUser();
        waitFor.until(ExpectedConditions.urlMatches("https://automation-str.stringeex.com/dashboard/callin"));
        homePage.action_clickOn_Contacts();
        contactPage.action_clickOn_AddContacts();
        contactAddPage.action_AddAContacts();
        waitFor.until(ExpectedConditions.visibilityOf(contactPage.firstContact_InList));
        Assert.assertEquals(contactPage.firstContact_InList.getText(),"Cuong");
    }
}
