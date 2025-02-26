package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static void switchToFrameIndex(int index) {
        switchTo().frame(index);
    }

    public static void switchToFrameElement(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }
}
