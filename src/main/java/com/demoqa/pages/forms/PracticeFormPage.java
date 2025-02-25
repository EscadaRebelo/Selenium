package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) { //if not found
            scrollToElementJS(sportsHobbyCheckbox); //scroll to element
            clickJS(sportsHobbyCheckbox); //then click it
        }
    }
    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) { //if not found
            scrollToElementJS(readingHobbyCheckbox); //scroll to element
            clickJS(readingHobbyCheckbox); //then click it
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) { //if not found
            scrollToElementJS(musicHobbyCheckbox); //scroll to element
            clickJS(musicHobbyCheckbox); //then click it
        }
    }
    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) { //if not found
            scrollToElementJS(readingHobbyCheckbox); //scroll to element
            clickJS(readingHobbyCheckbox); //then click it
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        //scrollToElementJS(submitButton);
        click(submitButton);
    }
}
