package com.realpage.automation.pages.basepage;

import com.realpage.automation.utils.driver.Setup;
import com.realpage.automation.utils.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver dv;
    protected Wait wait;

    public BasePage() {
        this.dv = Setup.driver;
        this.wait = new Wait(this.dv);
    }
}
