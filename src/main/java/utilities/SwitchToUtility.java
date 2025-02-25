package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText(); //gets the text from the alert
    }

    public static void acceptAlert() {
        switchTo().alert().accept(); //accept the alert and automatically closes it
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss(); //dismiss the alert
    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }
}
