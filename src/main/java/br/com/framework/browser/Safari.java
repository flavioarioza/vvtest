package br.com.framework.browser;

import org.openqa.selenium.safari.SafariDriver;

public class Safari extends Browser {

    protected Safari() {
        super(new SafariDriver());
    }
}
