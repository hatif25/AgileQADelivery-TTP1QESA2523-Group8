package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.MenuItems;
import pom.itemDetails;
import genericLibrary.BaseClass;
import genericLibrary.WebDriverUtilities;

import java.time.Duration;

public class ItemDetails extends BaseClass {

    @Test
    public void verifyingItemDetails() {
        itemDetails item = new itemDetails(driver);
        WebDriverUtilities util = new WebDriverUtilities();
        MenuItems menu = new MenuItems(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Hover on All Items image
        util.mouseHover(driver, item.getAllItemsmg());
        wait.until(ExpectedConditions.visibilityOf(item.getAllDetail()));
        Assert.assertTrue(item.getAllDetail().isDisplayed());

        // Click on Item1 category tab using POM getter
        menu.getMenuCategoriesItem1().click();
        util.mouseHover(driver, item.getItem1smg());
        wait.until(ExpectedConditions.visibilityOf(item.getItem1Detail()));
        Assert.assertTrue(item.getItem1Detail().isDisplayed());

        // Click on Item2 category tab using POM getter
        menu.getMenuCategoriesItem2().click();
        util.mouseHover(driver, item.getItem2smg());
        wait.until(ExpectedConditions.visibilityOf(item.getItem2Detail()));
        Assert.assertTrue(item.getItem2Detail().isDisplayed());
    }
}
