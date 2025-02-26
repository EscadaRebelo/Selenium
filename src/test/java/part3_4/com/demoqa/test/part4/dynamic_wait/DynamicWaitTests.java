package part3_4.com.demoqa.test.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTests extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedtext = ("Visible After 5 Seconds");
        Assert.assertEquals(actualText, expectedtext,
                "\n Actual & Expected Text Do Not Match. \n");
    }
}
