package br.com.framework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class ElementBy extends By {

	public static By mnuPesquisaQA() {
        return By.xpath("//*[@href='http://www.lourencodemonaco.com.br/vvtest/?page_id=2']");
    }
	
	
	public static By txtNome() {
        return By.id("nf-field-5");
    }
	
	public static By txtSobrenome() {
        return By.id("nf-field-6");
    }
	
	public static By txtEmail() {
        return By.id("nf-field-7");
    }
	
	public static By txtConfirmEmail() {
        return By.id("nf-field-8");
    }
	
	public static By txtTelefone() {
        return By.id("nf-field-17");
    }
	
	public static By chkIdade() {
        return By.id("nf-label-class-field-10-1");
    }
	
	public static By cmbExperienciaQA() {
        return By.xpath("//*[@id='nf-field-11']/option[2]");
    }
	
	public static By cmbAtracaoArea() {
        return By.xpath("//*[@id='nf-field-12']/option[1]");
    }
	
	public static By chkMelhoraArea() {
        return By.id("nf-label-class-field-13-3");
    }
	
	public static By txtLinguagemProgramacao() {
        return By.id("nf-field-14");
    }
	
	public static By txtResumo() {
        return By.id("nf-field-15");
    }
	
	public static By btnEnviar() {
        return By.id("nf-field-16");
    }
	
	public static By msgSucesso() {
        return className("nf-response-msg");
    }

}
