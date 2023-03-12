package exam4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crud {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sv = "jdbc:mysql://localhost:3306/exam4";
		String user = "root";
		String pass = "";
		
//		create(
//			sv, user, pass,
//			"clientes", "Martin", "martin@martin.com"
//		);
//		create(
//			sv, user, pass,
//			"productos", "pc", "123"
//		);
//		
//		
//		delete(
//			sv, user, pass,
//			"clientes", (byte) 1
//		);
//		delete(
//			sv, user, pass,
//			"productos", (byte) 1
//		);
		
		
//		get(
//			sv, user, pass,
//			"clientes"
//		);
//		get(
//			sv, user, pass,
//			"productos"
//		);
		
		
		update(
			sv, user, pass,
			"clientes", "Delo", (byte) 7
		);
		update(
			sv, user, pass,
			"productos", "Pedro", (byte) 2
		);
		get(
			sv, user, pass,
			"clientes"
		);
		get(
			sv, user, pass,
			"productos"
		);
	}
	
	public static void create(String sv, String user, String pass, String tabla, String param1, String param2) {
		try {
			
			Connection conexion = DriverManager.getConnection(sv, user, pass);
			Statement instruccion = conexion.createStatement();
			
			String query = "";
			
			if (tabla == "clientes") {
				query = "INSERT INTO "+ tabla +" (nombre, correo)" + 		
						" VALUES ('"+ param1 +"', '"+ param2 +"')";
			}
			
			if (tabla == "productos") {
				query = "INSERT INTO "+ tabla +" (nombre, precio)" + 		
						" VALUES ('"+ param1 +"', '"+ param2 +"')";
			}
			
			

			
			boolean resultado = instruccion.execute(query);
			
			
			// si es false, entonces la instrucción no devuelve un objeto de tipo ResultSet 
			if (!resultado) {
			// mostrar el número de registros insertados
				System.out.println("Registros insertados: " +
						instruccion.getUpdateCount());
			}
			// Segunda FORMA ejecutar instrucción con el método executeUpdate
//			int registrosInsertados = instruccion.executeUpdate(query);
			// mostrar el número de registros insertados 
//			System.out.println("Registros insertados: " + registrosInsertados);
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	

	public static void delete(String sv, String user, String pass, String tabla, byte id) {
		try {
			
			Connection conexion = DriverManager.getConnection(sv, user, pass);
			Statement instruccion = conexion.createStatement();
			
			String query = "";
			
			if (tabla == "clientes") {
				query = "DELETE FROM "+ tabla +" WHERE id=" + id;
			}
			
			if (tabla == "productos") {
				query = "DELETE FROM "+ tabla +" WHERE id=" + id;
			}
			
			

			
			boolean resultado = instruccion.execute(query);
			
			
			// si es false, entonces la instrucción no devuelve un objeto de tipo ResultSet 
			if (!resultado) {
			// mostrar el número de registros insertados
				System.out.println(tabla + " id: " + id + "DELETED");
			}
			// Segunda FORMA ejecutar instrucción con el método executeUpdate
//			int registrosInsertados = instruccion.executeUpdate(query);
			// mostrar el número de registros insertados 
//			System.out.println("Registros insertados: " + registrosInsertados);
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	
	
	public static void get(String sv, String user, String pass, String tabla) {
		try {
			
			Connection conexion = DriverManager.getConnection(sv, user, pass);
			Statement instruccion = conexion.createStatement();
			
			String query = "";
			
			if (tabla == "clientes") {
				query = "SELECT * FROM "+ tabla;
			}
			
			if (tabla == "productos") {
				query = "SELECT * FROM "+ tabla;
			}
			
			boolean resultado = instruccion.execute(query);

			
			if (resultado) {
				ResultSet resultados2 = instruccion.getResultSet();
				
				while (resultados2.next()) {
					System.out.println(
						tabla + 
						" id: " + resultados2.getInt("id") + 
						", nombre: " + resultados2.getString("nombre")
					); 

				}
				
			}

			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	
	
	public static void update(String sv, String user, String pass, String tabla, String param1, byte param2) {
		try {
			
			Connection conexion = DriverManager.getConnection(sv, user, pass);
			Statement instruccion = conexion.createStatement();
			Statement instruccion2 = conexion.createStatement();
			
			String query = "UPDATE "+ tabla +
							" SET nombre = '"+ param1 +
							"' WHERE id=" + param2;		
				
			
			boolean resultado = instruccion.execute(query);
			
			if (!resultado) {
				// mostrar el número de registros insertados
					System.out.println("Registros actualizados: " +
							instruccion.getUpdateCount());
				}
			
//			String query2 = "SELECT * FROM " + tabla + 
//							" WHERE id="+param2;
//
//			
//			boolean resultado2 = instruccion2.execute(query2);
//		
//					
//			if (resultado && resultado2) {
//				ResultSet res = instruccion.getResultSet();
//				ResultSet res2 = instruccion.getResultSet();
//				
//				System.out.println(
//					"nombre anterior: " + res2.getString("nombre") +
//					", nombre nuevo: " + res.getString("nombre") 
//				);
//			}
			
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	
}