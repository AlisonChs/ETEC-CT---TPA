import java.sql.*;

public class connect {
	
	private Connection connection1 = null;
	
	private Statement statment = null;
	
	private ResultSet resultset = null;
	
	public void connect () {
		String servidor = "jdbc:mysql://localhost:3306/tb_amigo";
		
		String usuario = "root";
		String senha = "";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
		
			this.connection1 = DriverManager.getConnection (servidor, usuario, senha);
			
			this.statment = this.connection1.createStatement();
		
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}	
	
}
