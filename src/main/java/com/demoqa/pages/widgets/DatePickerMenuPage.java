package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage {

    //select date field
    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day) {
        click(dayValue(day));
    }

    //check if a certain day exists in a month (not every month has 31 days)
    public boolean isDayInMonth(String Day) {
        return find(dayValue(Day)).isDisplayed();
    }

    //click the selected date field
    public void clickSelectDate() {
        click(selectDateField);
    }

    //get the date
    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    //select month DropDown
    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    //select year DropDown
    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }
}
