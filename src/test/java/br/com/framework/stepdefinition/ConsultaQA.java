package br.com.framework.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import br.com.framework.helper.*;
import br.com.framework.modelpage.vvtest.*;
import br.com.framework.pageobject.BasePage;
import cucumber.api.java.pt.*;
import junit.framework.*;

public abstract class ConsultaQA extends ElementBy {
	
	protected WebDriver driver;

    private BrowserHelper helper;
    
    private ElementBy elemento;

    private BasePage parentPage;
    
    private VVTest vvTest;
    
    
	
	@Dado("^que eu acesse a pagina da VV Test$")
	public void que_eu_acesse_a_pagina_da_VV_Test(String login) throws Throwable {
		
		driver.get("https://bit.ly/3jOMrR9");
		driver.manage().window().maximize();
	}

	@E("^acesse o menu 'Pesquisa - QA'$")
	public void acesse_o_menu(String senha) throws Throwable {
		helper.click(ElementBy.mnuPesquisaQA());
	}

	@Quando("^eu preencher todos os campos obrigatorios$")
	public void eu_preencher_todos_os_campos_obrigatorios() throws Throwable {
		
		vvTest.preencherCamposObrigatorios();
	}

	@Então("^deve ser direcionado para uma pagina de sucesso$")
	public void deve_ser_direcionado_para_uma_pagina_de_sucesso() throws Throwable {
		
		assertEquals(ElementBy.msgSucesso().toString(), "Your form has been successfully submitted." );

	}
}
