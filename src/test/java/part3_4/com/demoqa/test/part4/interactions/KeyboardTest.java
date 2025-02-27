package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Rodrigo Rebelo");
        textBoxPage.setEmail("rodrigorebelo@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"),
                "\n Actual Address Does Not Contain 'Suite 3400'. \n");
    }
}
