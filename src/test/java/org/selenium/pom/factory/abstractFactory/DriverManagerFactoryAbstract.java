package org.selenium.pom.factory.abstractFactory;

import org.selenium.pom.constants.DriverTypeOption;

public class DriverManagerFactoryAbstract {

    public static DriverManagerAbstract getManager(DriverTypeOption driverTypeOption) {
        switch (driverTypeOption) {
            case CHROME -> {
                return new ChromeDriverManagerAbstract();
            }
            case FIREFOX -> {
                return new FirefoxDriverManagerAbstract();
            }
            default -> throw new IllegalStateException("Unexpected value: " + driverTypeOption);
        }
    }
}
