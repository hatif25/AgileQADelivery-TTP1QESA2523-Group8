package scripts;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.CopyrightFooter;

public class CheckCopyrightFooter extends BaseClass {
	
	
	@Test
	public void checkingFooter() {
		CopyrightFooter footer = new CopyrightFooter(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		footer.homeBtnClick();
		Assert.assertTrue(footer.copyrightTxtDisplayed());
	}

}
