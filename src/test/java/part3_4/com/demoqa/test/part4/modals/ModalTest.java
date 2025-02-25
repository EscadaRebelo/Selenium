package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog () {
        var afwPaGe = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPaGe.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The message does Not Cointain 'Small Modal'. \n");
        modalDialogsPage.clickCloseButton();
    }
}
