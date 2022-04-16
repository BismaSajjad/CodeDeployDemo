package allTests;

import baseTest.BaseTest;
import org.testng.annotations.Test;

public class FileUploadLinkTest extends BaseTest {


    @Test
    public void verifyFileUpload() {
        var uploadFilePage = homePage.goToFileUploadPage();
        uploadFilePage.uploadFile("D:/automation/resources/geckodriver.exe");
    }
}
