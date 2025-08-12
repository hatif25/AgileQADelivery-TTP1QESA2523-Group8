package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopyrightFooter {
	
	WebDriver driver;
	
	public CopyrightFooter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[normalize-space()='© 2021. Live Cook Restaurant. All Rights Reserved']")
	private WebElement copyrighTxt;
	
	@FindBy(xpath="//*[@id=\"homepage\"]")
	private WebElement homeBtn;
	
	public void homeBtnClick() {
		homeBtn.click();
	}
	
	public boolean copyrightTxtDisplayed() {
		return copyrighTxt.isDisplayed();
	}

}
