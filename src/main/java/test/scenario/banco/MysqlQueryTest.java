package test.scenario.banco;

import org.jbehave.scenario.Scenario;

import test.steps.banco.AplicacaoConectouComBancoDeDados;
import test.steps.banco.AplicacaoNaoConectouComBancoDeDados;

public class MysqlQueryTest extends Scenario{
	
	public MysqlQueryTest() {
		
		addSteps(new AplicacaoConectouComBancoDeDados());
		addSteps(new AplicacaoNaoConectouComBancoDeDados());
		
	}

}
