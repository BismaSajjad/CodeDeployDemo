package allTests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WYSIWYGEditorTest extends BaseTest {

    @Test
    public void verifyIframeEntry() {
        // Go to Editor Page
        var wysiwygEditor = homePage.goToWYSIWYGEditorPage();

        //verify that WYSIWYG page loads
        Assert.assertEquals(wysiwygEditor.getpageTitle(), "An iFrame containing the TinyMCE WYSIWYG Editor");

        //clear text box
        wysiwygEditor.clearTextBox();

        // enter hello in text box
        wysiwygEditor.enterTextInTextBox("Hello ");

        //click increase indent
        wysiwygEditor.increaseIndent();

        //enter world in text box
        wysiwygEditor.enterTextInTextBox("Bisma");

        //click increase indent
        wysiwygEditor.increaseIndent();


        // verify that text has been entered
        Assert.assertEquals(wysiwygEditor.getTextFromTextBox(), "Hello Bisma");

    }
}
