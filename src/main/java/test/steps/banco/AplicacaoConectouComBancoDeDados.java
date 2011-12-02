package test.steps.banco;

import java.sql.SQLException;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

import banco.MysqlDB;

public class AplicacaoConectouComBancoDeDados extends Steps {

	MysqlDB banco;

	@Given("o banco de dados $url conectado")
	public void conectarNoBanco(String url) throws ClassNotFoundException,
			SQLException {
		banco = new MysqlDB(url);
		banco.connect();
	}

	@When("a tabela $funcionario for solicitada")
	public void acessarTabelaFuncionario(String funcionario) throws Exception {
		banco.isconnected();
	}

	@Then("mostrar a mensagem $msg")
	public void funcionarioCPF11(MysqlDB banco) {
		banco = new MysqlDB("jdbc:mysql://localhost:8889/vvs_bbd");
		try {
			banco.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
