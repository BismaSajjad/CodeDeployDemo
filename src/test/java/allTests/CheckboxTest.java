package allTests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest {
    @Test
    public void TestInputPage() {
        CheckboxPage checkBoxPage = homePage.goToCheckboxPage();
        checkBoxPage.selectCheckBox1();
        checkBoxPage.selectCheckBox2();
    }

}
