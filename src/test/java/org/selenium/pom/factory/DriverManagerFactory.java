package org.selenium.pom.factory;

import org.selenium.pom.constants.DriverTypeOption;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverTypeOption driverTypeOption) {
        switch (driverTypeOption) {
            case CHROME -> {
                return new ChromeDriverManager();
            }
            case FIREFOX -> {
                return new FirefoxDriverManager();
            }
            default -> throw new IllegalStateException("Unexpected value: " + driverTypeOption);
        }
    }
}
