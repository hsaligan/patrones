package patrones.fabrica;

import patrones.fabrica.IConexion;
import patrones.fabrica.ConexionMySQL;
import patrones.fabrica.ConexionOracle;
import patrones.fabrica.ConexionPostgreSQL;
import patrones.fabrica.ConexionSQLServer;
import patrones.fabrica.ConexionVacia;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}