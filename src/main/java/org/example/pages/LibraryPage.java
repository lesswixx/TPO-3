package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {

    public WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-two-row-item-renderer[1]")
    private WebElement checkLikedSongs;

    public LibraryPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getCheckLikedSongs() {
        return checkLikedSongs;
    }
}
