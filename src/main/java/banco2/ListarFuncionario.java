package banco2;
	
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.ArrayList;  
import java.util.List; 
import main.model.Funcionario;
	  
public class ListarFuncionario{  
	  
	    public List<Funcionario> getUsuarios() throws SQLException {  
	                                Conexao con = new Conexao();  
	        List<Funcionario> listaUsuarios = new ArrayList<Funcionario>();  
	        Funcionario funcionario;  
	        Statement st = con.obterConexao().createStatement();  
	        ResultSet rs = st.executeQuery("select * from tb_funcionario");  
	        while (rs.next()) {  
	            funcionario = new Funcionario();  
	            funcionario.setNome(rs.getString("nome"));  
	            funcionario.setPsaude(rs.getInt("psaude"));  
	            listaUsuarios.add(funcionario);  
	        }  
	        return listaUsuarios;  
	    }  
	}  