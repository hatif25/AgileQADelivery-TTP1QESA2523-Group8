package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	public void dropDown(WebElement dropdown, String text) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele) {
	    try {
	        // Wait until the element is visible
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.visibilityOf(ele));

	        // Try to hover using Actions
	        Actions a = new Actions(driver);
	        a.moveToElement(ele).perform();
	    } catch (Exception e) {
	        // Fallback: scroll into view using JavaScript
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	    }
	}

	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragandDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void switchFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertpopupAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void alertpopupDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
		public void scroll(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
}
