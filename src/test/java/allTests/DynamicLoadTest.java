package allTests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadTest extends BaseTest {

    @Test
    public void verifyExample1LoadTest() {
        var example1 = homePage.goToDynamicPage().goToExample1();
        example1.clickStart();
        Assert.assertEquals(example1.textFound(), "Hello World!");
    }
}
