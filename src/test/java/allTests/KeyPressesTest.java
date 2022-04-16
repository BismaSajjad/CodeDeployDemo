package allTests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {

    @Test
    public void verifyKeyPresses() {
        var keyPress = homePage.goToKeyPressPage();
        keyPress.enterText("T");
        Assert.assertEquals(keyPress.getResultText(), "You entered: T", "Textbox value is not correct");
        keyPress.enterBackSpace();
        Assert.assertEquals(keyPress.getResultText(), "You entered: BACK_SPACE", "Textbox value is not correct");
    }

}
