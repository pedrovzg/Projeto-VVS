package test.scenario;

import org.jbehave.scenario.Scenario;

import test.steps.FuncionarioEstaCadastrado;
import test.steps.FuncionarioNaoEstaCadastrado;

public class FuncionarioCadastroTest extends Scenario {
	
	public FuncionarioCadastroTest(){
		
		addSteps(new FuncionarioEstaCadastrado());
		addSteps(new FuncionarioNaoEstaCadastrado());
		
	}
	
    
}