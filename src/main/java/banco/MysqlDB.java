package banco;

import java.sql.*;

public class MysqlDB {

	public String host;
	public String user = "root";
	public String password = "root";
	public Connection conn = null;
	private boolean status;

	public MysqlDB(String hosttmp) {
		host = hosttmp;
		status = false;
	}

	public void connect() throws ClassNotFoundException, SQLException{
//		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(host, user, password);
			status = true;
			System.out.println("A conex‹o foi um sucesso");
//		} catch (ClassNotFoundException e) {
//			throw new Exception("N‹o achou a classe.");
////			System.out.println("excess‹o Classe n‹o encontrada");
////			e.printStackTrace();
//		} catch (SQLException e) {
//			throw new Exception("SQL Exception... N‹o conectado");
//		}
	}

	public void disconnect() {
		try {
			conn.close();
			status = false;
			System.out.println("Fechando a conex‹o");
		} catch (SQLException erro) {
			System.out.println("Erro no fechamento");
			// erro.printStackTrace();
		}
	}

	public boolean isconnected() {
		return status;
	}

}