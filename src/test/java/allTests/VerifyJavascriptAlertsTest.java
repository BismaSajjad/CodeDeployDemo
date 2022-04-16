package allTests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyJavascriptAlertsTest extends BaseTest {


    @Test
    public void VerifyOkJavaScriptAlert() {
        var javaScriptAlertPage = homePage.goToJavascriptAlert();
        javaScriptAlertPage.clickAlertTrigger();
        Assert.assertEquals(javaScriptAlertPage.getTextFromJavaScriptAlert(), "I am a JS Alert");
        javaScriptAlertPage.okJavaScriptAlert();
        Assert.assertEquals(javaScriptAlertPage.getResultText(), "You successfully clicked an alert");
    }


    @Test
    public void verifyConfirmAlert() {
        var confirmAlert = homePage.goToJavascriptAlert();
        confirmAlert.clickConfirmTrigger();
        Assert.assertEquals(confirmAlert.getTextFromJavaScriptConfirm(), "I am a JS Confirm");
        confirmAlert.okConfirmAlert();
        Assert.assertEquals(confirmAlert.getResultText(), "You clicked: Ok");
        confirmAlert.clickConfirmTrigger();
        confirmAlert.cancelConfirmAlert();
        Assert.assertEquals(confirmAlert.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void verifyPromptAlert() {
        var promptAlert = homePage.goToJavascriptAlert();
    }


}
