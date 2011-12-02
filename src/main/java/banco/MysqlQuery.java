package banco;

import java.sql.*;


public class MysqlQuery {

		
		public Connection Database = null;
		public boolean status;
		public ResultSet rs;
		public Statement stm;
		private boolean statusreg =true;
		
		
		public MysqlQuery(Connection Db){
		  try {
		      Database=Db;
		      stm = Database.createStatement();          
		      status = false;        
		  } catch(SQLException e) {
		      e.printStackTrace();
		      System.out.print("Erro ao criar Query!");
		  }   
		}
		
		public void open(String sql) {
		 try {
		      rs= stm.executeQuery(sql);        
		      status = true;    
		  } catch(SQLException e) {
		      status = false;
		      System.out.print("Erro ao executar Query!");
		      e.printStackTrace();
		  }   
		}
		
		public void execute(String sql) {
		 try {
		      stm.execute(sql);        
		      status = true;    
		  } catch(SQLException e) {
		      status = false;
		      System.out.print("Erro ao executar Query!");
		      e.printStackTrace();
		  }   
		}
		
		public String fieldbyname(String field){ 
		String value = null;
		  try {        
		     if(rs.getString(0)!=null) status=false;
		     System.out.println(rs.getString(1));
		     if(status) rs.next();
		     value = rs.getString(field);
		     status=true;
		  } catch(SQLException e) {
		  
			  System.out.println("Field invalido!");
		  }
		  return value;
		}
		
		public int recordcount(){
		int tot=0;
		  try {
		    rs.first();        
		    do {
		    tot++;
		    } while(rs.next());      
		  } catch(SQLException e) {
		      status = false;
		      System.out.print("Erro ao executar Query!");
		      e.printStackTrace();
		  }   
		
		return tot;
		}
		
		public boolean next(){
		boolean retorno=false;
		try {        
		      if(rs.next()){retorno=true;}
		      
		  } catch(SQLException e) {
		      System.out.print("Erro ao executar Query!");
		  }   
		return retorno;
		}
		
		public boolean prev(){
		boolean retorno=false;
		try {        
		      if(rs.previous()){retorno=true;}
		  } catch(SQLException e) {
		      System.out.print("Erro ao executar previous!");
		  }   
		
		return retorno;
		}
		public boolean first(){
		boolean retorno=false;
		try {        
		      if(rs.first()){retorno=true;}
		  } catch(SQLException e) {
		      System.out.print("Erro ao executar first!");
		  }   
		
		return retorno;
		}
		
		public boolean last(){
		boolean retorno=false;
		try {        
		      if(rs.last()){retorno=true;}
		  } catch(SQLException e) {
		      System.out.print("Erro ao executar last!");
		  }   
		
		return retorno;
		}
}