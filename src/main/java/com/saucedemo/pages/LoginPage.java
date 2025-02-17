package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    /* this is a setter method, and it returns the value of an attribute. */
    public void setUsername(String username) {
        set(usernameField, username);
    }

    /* this is a setter method, and it returns the value of an attribute. */
    public void setPassword(String password) {
        set(passwordField, password);
    }

    /* this is a transition method, and it is important when our app changes to a different page. */
    /* transition methods must not have 'void' as return type, the return type should be
    what you're going to transition to*/
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    /* this is also a transition method, and it is important when our app changes to a different page. */
    /* transition methods must not have 'void' as return type, the return type should be
    what you're going to transition to*/
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    /* this is a getter method, that, in this case, will get the error message*/
    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}


