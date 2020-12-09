package br.com.framework.runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class Runner {
	
	// --------------------- Este arquivo é gerado automaticamente pelo execution_dealer.py (Orquestrador)
	@CucumberOptions(features={"src//test//java//features//ConsultaQA.feature"}
	,glue={"stepdefinations","utility"}
	,plugin = {"pretty", "html:target/cucumber"}
	)
	@Test
	public class Runner extends AbstractTestNGCucumberTests{

	}
	
}
