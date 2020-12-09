package br.com.framework.pageobject;

import br.com.framework.helper.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public abstract class BasePage extends LoadableComponent<BasePage> {

    protected final WebDriver driver;

    private final BrowserHelper helper;

    private BasePage parentPage;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.helper = new BrowserHelper(driver);
        PageFactory.initElements(driver, this);
        load();
    }

    public BasePage(WebDriver driver, BasePage parentPage) {
        this(driver);
        this.parentPage = parentPage;
    }

    @Override
    public abstract void load();

    @Override
    public abstract void isLoaded() throws Error;

	public void preencherCamposObrigatorios() {
		// TODO Auto-generated method stub
		
	}

}
