package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.SearchItemIphone;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchForIPhoneTest extends BaseTest {

    @Test
    public void searchWithPartialMatch() {
        String searchFor = "iPhone 14";
        SearchItemIphone searchItemIphone = new SearchItemIphone(getDriver()).
                load().
                search(searchFor);
        Assert.assertEquals(searchItemIphone.getTitle(), searchFor);
    }
}
