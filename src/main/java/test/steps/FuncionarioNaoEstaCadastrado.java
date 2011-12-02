package test.steps;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import main.model.Funcionario;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

public class FuncionarioNaoEstaCadastrado extends Steps {
	

	  //Objeto que representa o cliente
	private Funcionario funcionario;

	    //Vari‡vel usada para validar se o saque foi ou n‹o liberado
	private boolean funcionarioNaoCadastrado = true;

	    //Vari‡vel usada para armazenar a mensagem que ser‡ validada a seguir
	private Exception exception;

	@Given("o cpf do funcionario $cpf")
	
	public void funcionarioCPF(int cpf) {
	funcionario = new Funcionario();
	funcionario.setCpf(cpf);
	}
  //Efetua o saque e armazena a mensagem de retorno na vari‡vel que ser‡ testada a seguir
	
	@When("quando o diretor inserir o cpf $cpf")
	public void inserirCPF(int cpf){
	   try {
	     //funcionario.imprimirCPF(cpf);
	   } catch (Exception e) {
	     this.exception = e;
	   }	
	 }

	    //Validar se o saque foi negado e se mensagem de retorno foi a mesma que a especificada no cen‡rio
	@Then("nao deve mostrar as informacoes do funcionario e retornar a mensagem $msg")
	
	 public void verificaOCadastro(String msg){
	  assertFalse(funcionarioNaoCadastrado);
	   assertEquals(msg, exception.getMessage());
	 }
}
	

