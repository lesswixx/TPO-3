package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElement emailInputField;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    private WebElement identifierNextButton;

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordInputField;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    private WebElement passwordNextButton;

    public WebDriver webDriver;

    public SignInPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }


    public WebElement getEmailInputField() {
        return emailInputField;
    }

    public WebElement getIdentifierNextButton() {
        return identifierNextButton;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getPasswordNextButton() {
        return passwordNextButton;
    }
}
