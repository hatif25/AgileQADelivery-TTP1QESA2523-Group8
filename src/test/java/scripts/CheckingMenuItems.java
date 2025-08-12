package scripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pom.MenuItems;


public class CheckingMenuItems extends BaseClass {
	
	
@Test
public void checkingMenu() {
	MenuItems menu = new MenuItems(driver);

    Assert.assertEquals(true, menu.isMenuCategoriesAllDisplayed());
    Assert.assertEquals(true, menu.isMenuCategoriesItem1Displayed());
    Assert.assertEquals(true, menu.isMenuCategoriesItem2Displayed());
}
}