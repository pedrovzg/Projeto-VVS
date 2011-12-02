package banco2;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
  
public class Conexao {  
      
    public static String status = "";  
  
    public Connection obterConexao() {  
    Connection con = null;  
    try {  
       Class.forName("com.mysql.jdbc.Driver").newInstance();  
       String url = "jdbc:mysql://localhost:8889/vvs_bbd";  
       con = DriverManager.getConnection(url, "root", "root");  
  
       status = "Conex‹o Aberta";  
      }catch (SQLException e){  
       status = e.getMessage();  
      }catch (ClassNotFoundException e){  
       status = e.getMessage();  
      }catch (Exception e ){  
       status = e.getMessage();  
      }  
      return con;  
  }  
    
} 