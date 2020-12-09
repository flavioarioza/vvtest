package br.com.framework.modelpage.vvtest;

import org.testng.AssertJUnit;
import junit.framework.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.framework.helper.ElementBy;
import br.com.framework.pageobject.BasePage;
import br.com.framework.helper.BrowserHelper;

public abstract class VVTest extends BasePage {
	   
	public VVTest(WebDriver driver, BasePage parentPage) {
		super(driver, parentPage);
		// TODO Auto-generated constructor stub
	}
	
	VVTestData data = new VVTestData(new ElementBy() {
		
		

		@Override
		public List<WebElement> findElements(SearchContext arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	}, new BrowserHelper(driver));

	public void containsResult(String... values) {
        boolean containsResult = Arrays.stream(values)
                .anyMatch(value -> results.stream().anyMatch(webElement -> webElement.getText().contains(value)));
        AssertJUnit.assertTrue(containsResult);
    }

}