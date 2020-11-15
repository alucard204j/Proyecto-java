package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class controladorBD {
	// Librera de MySQL
	public String driver = "com.mysql.cj.jdbc.Driver";

	// Nombre de la base de datos
	public String database = "prueba";

	// Host
	public String hostname = "127.0.0.1";

	// Puerto
	public String port = "3306";

	// Ruta de nuestra base de datos (desactivamos el uso de SSL con
	// "?useSSL=false")
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	// Nombre de usuario
	public String username = "root";

	// Clave de usuario
	public String password = "";

	public Connection conectarMySQL() {
		Connection conn = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
//Listas
	public static ResultSet listarUsuarios() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM usuario;");
		return res;
	}
	
	public static ResultSet listarEstudiantes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM estudiante");
		return res;
	}
	
	public static ResultSet listarMaterias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM materia;");
		return res;

	}
	public static ResultSet listarinasistencias() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM inasistencia;)");
		return res;

	}
	public static ResultSet listarDocentes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM docente;");
		return res;
	}
	public static ResultSet listarFuncionarios() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM funcionario;");
		return res;

	}
	public static ResultSet listarEstudiantesConPendientes() throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("SELECT * FROM ");
		return res;

	}
	
//Fin listas

//Dar de alta una usuario
	public static ResultSet altaEstudiante(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd, String generacion, String orientacion, String estado) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" +"("+ci+nombre+apellido+fechaNac+email+passwd+")"+";");
		res = st.executeQuery("INSERT INTO estudiante(ci, generacion, orientacion, estado) VALUES"+ci+generacion+estado+";");
		return res;
		}
	
	public static ResultSet altaDocente(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" +"("+ci+nombre+apellido+fechaNac+email+passwd+")"+";");
		res = st.executeQuery("INSERT INTO docente(ci) VALUES" +"("+ci+")"+";");
		return res;
		}
	
	public static ResultSet altaFuncionario(int ci, String nombre, String apellido, LocalDate fechaNac, String email, String passwd) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO usuario(ci, nombre, apellido, fechaNac, email, passwd) VALUES" +"("+ci+nombre+apellido+fechaNac+email+passwd+")"+";");
		res = st.executeQuery("INSERT INTO funcionario(ci) VALUES" +"("+ci+")"+";");
		return res;
		}

//Dar de alta una Materia
	
	public static ResultSet altaMateria(String codigoM, String nombre, String orientación, String generación) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO materia(codigoM, nombre, orientación, generación) VALUES" +"("+codigoM+nombre+orientación+generación+")"+";");
		return res;
		}

//Dar de alta una Inasistencia
	
	public static ResultSet altaInasistencia(int codigoInasistencia,int ci, String codigoM,String tipo,LocalDate fecha) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO inasistencia(codigoInasistencia, ci, codigoM, tipo, fecha) VALUES" +"("+codigoInasistencia+ci+codigoM+tipo+fecha+")"+";");
		return res;
		}

//Dar de alta un Examen
	
	public static ResultSet altaExamen(int ci,String codigoM, LocalDate fecha,int nota,int idExamen) throws Exception {
		Connection controlador = getMySqlConnection();
		Statement st;
		ResultSet res;
		st = controlador.createStatement();
		res = st.executeQuery("INSERT INTO examen(ci, codigoM, fecha, nota, idExamen) VALUES" +"("+ci+codigoM+fecha+nota+idExamen+")"+";");
		return res;
		}
	
//Consultar un Usuario
	
		public static ResultSet buscarUsuario(int ci) throws Exception {
			Connection controlador = getMySqlConnection();
			Statement st;
			ResultSet res;
			st = controlador.createStatement();
			res = st.executeQuery("SELECT * FROM usuario WHERE usuario."+ci+";");
			return res;
		}
		
	//Modificar un Usuario 
	
		public static ResultSet modificarUsuario(int ci,String dato,String newDat) throws Exception {
			Connection controlador = getMySqlConnection();
			Statement st;
			ResultSet res;
			st = controlador.createStatement();
			res = st.executeQuery("INSERT INTO () VALUES" +"("+")"+";");
			return res;
			}
		
	// coneccion
	private static Connection getMySqlConnection() {
		return null;
	}

}
