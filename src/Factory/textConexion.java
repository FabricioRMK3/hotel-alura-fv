package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class textConexion {
	public static void main(String[] args) throws SQLException {
		ConexionBD con = new ConexionBD();
		Connection cone = con.conectarBase();
		
		System.out.println("Conecto bien");
		cone.close();
		
		System.out.println("Cerro bien");
	}

}
