package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.ContactNumber;

public class CheckPhoneNumberDisplayed extends BaseClass {

    @Test
    public void checkPhoneNumber() {
        ContactNumber number = new ContactNumber(driver);
        Assert.assertTrue(number.isPhoneNumberDisplayed());
    }
}
