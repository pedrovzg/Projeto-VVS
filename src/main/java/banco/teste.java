package banco;

public class teste {
	

	public static void main(String args[]){
	
	//System.out.println("vai cagar no mato");

	//cria um objeto MysqlDB apontando para o banco especificado.
	MysqlDB banco = new MysqlDB("jdbc:mysql://localhost:8889/vvs_bbd");
	try {
		banco.connect();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //conecta ao banco
	MysqlQuery query1 = new MysqlQuery(banco.conn);

	//Cria um objeto do tipo query chamado query1 que recebe como argumento o  objeto banco. 
	
	query1.open("select * from tb_funcionario"); //executa uma sentença sql.
	query1.execute("select * from tb_funcionario");
	//query1.last(); //vai para o ultimo registro
	
	do{
		System.out.println("Nome -------| " + query1.fieldbyname("nome"));
	}while(query1.prev());
	
	}

}