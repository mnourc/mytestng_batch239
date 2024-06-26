package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {


    public OrangeLoginPage(){
        //PageFactory is used to initiate the driver and the elements
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Locating the web elements
    @FindBy(name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//button[text()=' Login ']")
    public WebElement loginButton;

    //merve

}
