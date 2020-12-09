package br.com.framework.modelpage.vvtest;

import br.com.framework.helper.BrowserHelper;
import br.com.framework.helper.ElementBy;
import br.com.framework.pageobject.BasePage;

public class VVTestData {
	public ElementBy elemento;
	public BrowserHelper browser;
	public BasePage basePage = new BasePage(driver) {
		
		@Override
		public void preencherCamposObrigatorios() {
			browser.type(elemento.txtNome(), "Flavio");
			browser.type(elemento.txtSobrenome(), "Arioza");
			browser.type(elemento.txtEmail(), "farioza@gmail.com");
			browser.type(elemento.txtConfirmEmail(), "farioza@gmail.com");
			browser.click(elemento.chkIdade());
			browser.type(elemento.cmbExperienciaQA(), "farioza@gmail.com");
			browser.click(elemento.cmbAtracaoArea());
			browser.click(elemento.chkMelhoraArea());
			browser.type(elemento.txtLinguagemProgramacao(), "C#, Java, Ruby");
			
		}		
		
		@Override
		public void load() {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void isLoaded() throws Error {
			// TODO Auto-generated method stub
			
		}
		
	};

	public VVTestData(ElementBy elemento, BrowserHelper browser) {
		this.elemento = elemento;
		this.browser = browser;
	}
}