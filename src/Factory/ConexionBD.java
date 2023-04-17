package Factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConexionBD {
	public DataSource dataSou;
	
	public ConexionBD() {
		ComboPooledDataSource comboPool  = new ComboPooledDataSource();
		comboPool.setJdbcUrl("jdbc:mysql://localhost/hotel_alura_fv?useTimeZone=true&serverTimeZone=UTC");
		comboPool.setUser("root");
		comboPool.setPassword("");
		
		this.dataSou = comboPool;
	}
	
	public Connection conectarBase() {
		try {
			return this.dataSou.getConnection();
		}catch (SQLException e) {
		System.out.println("Hubo un error");
		throw new RuntimeException(e);
		}
	}
}
