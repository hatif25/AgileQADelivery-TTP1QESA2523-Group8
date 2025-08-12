package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsText {
	
	WebDriver driver;
	
	public ContactUsText(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='contactus']")
	private WebElement contactBtn;
	
	@FindBy(xpath="//h3[normalize-space()='Send us a message']")
	private WebElement txtToCheck;
	
	public void clickContactBtn() {
		contactBtn.click();
	}
	
	public boolean checkContactTxt() {
		return txtToCheck.isDisplayed();
	}

}
