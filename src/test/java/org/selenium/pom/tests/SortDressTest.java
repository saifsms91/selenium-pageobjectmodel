package org.selenium.pom.tests;

import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.DressPage;
import org.testng.annotations.Test;

public class SortDressTest extends BaseTest {

    @Test
    public void sortDressInAscendingOrder() throws InterruptedException {
        String searchFor = "Dell Laptops in Malaysia Price List for December, 2022";
        DressPage storePage = new DressPage(getDriver()).
                load().sortDress();

        Thread.sleep(1000);
        // selectAnOption();
//                search(searchFor);
        //  Assert.assertEquals(storePage.getTitle(),searchFor);
    }
}
