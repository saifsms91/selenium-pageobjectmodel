package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTestSample extends BaseTest {

    @Test
    public void searchForDell() {
        String searchFor = "Dell Laptops in Malaysia Price List for December, 2022";
        StorePage storePage = new StorePage(getDriver()).
                load().clickBrand().clickDell();
        Assert.assertEquals(storePage.getTitle(), searchFor);
    }
}
