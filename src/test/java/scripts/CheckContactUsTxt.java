package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom.ContactUsText;

public class CheckContactUsTxt extends BaseClass {
	
	@Test
	public void checkTxtContact() {
		ContactUsText c = new ContactUsText(driver);
		
		c.clickContactBtn();
		Assert.assertTrue(c.checkContactTxt());
	}

}
