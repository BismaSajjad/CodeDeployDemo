package allTests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {
    @Test
    public void TestInputPage() {
        DropdownPage dropdownPage = homePage.goToDropdownPage();
        dropdownPage.showDropdownOptions();
        dropdownPage.selectByOptionText("Option 2");
        System.out.println("Option selected is " + dropdownPage.GetSelectedText());

        dropdownPage.selectByOptionIndex(2);
        System.out.println("Option selected is " + dropdownPage.GetSelectedText());

    }


}
