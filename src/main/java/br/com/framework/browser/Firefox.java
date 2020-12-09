package br.com.framework.browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox extends Browser {

    protected Firefox() {
        super(new FirefoxDriver());
    }
}
