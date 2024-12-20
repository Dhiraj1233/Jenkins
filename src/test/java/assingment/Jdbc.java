package assingment;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc 
{
	public static void main(String[] args) throws ClassNotFoundException

	{
		String dbUri="jdbc:mysql://localhos:3306/advsel";//path of the file
		Class.forName("com.mysql.cj.jdbc.Driver");//connector file path to db
		try {
			DriverManager.getConnection(dbUri,"root","root");//established the connection between java and backend
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection failed");
		}
	}

}
