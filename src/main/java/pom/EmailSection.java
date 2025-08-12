package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailSection {
    WebDriver driver;

    public EmailSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='info@livecook.com']") 
    private WebElement emailElement;

    public boolean isEmailDisplayed() {
        return emailElement.isDisplayed();
    }
}
