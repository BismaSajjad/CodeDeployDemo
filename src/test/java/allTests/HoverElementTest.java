package allTests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverElementTest extends BaseTest {

    @Test
    public void verifyHoverElement() {
        var hoverPage = homePage.goToHoversPage();
        var caption = hoverPage.hoverByUsingFigure(2);

        Assert.assertTrue(caption.displayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getName(), "name: user3", "Name displayed is not correct");
        Assert.assertTrue(caption.getURL().endsWith("/users/3"), "Url is not correct");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Link text is not correct");
    }

}
