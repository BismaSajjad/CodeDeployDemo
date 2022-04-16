package allTests;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTest {

    @Test
    public void verifyAdModelWindow() {
        var adModel = homePage.goToEntryAdPage();
    }
}
