package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactNumber {
    WebDriver driver;

    public ContactNumber(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[normalize-space()='+91 2314562310']") 
    private WebElement phoneNumber;

    public boolean isPhoneNumberDisplayed() {
        return phoneNumber.isDisplayed();
    }
}
