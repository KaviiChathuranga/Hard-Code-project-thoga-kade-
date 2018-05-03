package thogaKade.db;
import java.sql.*;
public class DBConnection{
	private Connection conn;
	private static DBConnection dbConnection;
	private DBConnection()throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://Localhost/thogaKade","root","kavinduk0");
	}
	public Connection getConnection(){
	return conn;
	}
	public static DBConnection getDBConnection()throws SQLException,ClassNotFoundException{
		if(dbConnection==null){
			dbConnection=new DBConnection();
		}
		return dbConnection;
	}
} 
