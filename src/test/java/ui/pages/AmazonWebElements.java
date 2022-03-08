package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;


import java.util.List;

public class AmazonWebElements {

    public AmazonWebElements() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement mainMenu;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement emailtextbox;

    @FindBy(className = "a-button-input")
    public WebElement continueButton;

    @FindBy(id = "auth-error-message-box")
    public WebElement errorMessage;

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allButton;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//a")
    public List<WebElement> categoriMenu;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//a")
    public List<WebElement> subCategoriMenu;





}



