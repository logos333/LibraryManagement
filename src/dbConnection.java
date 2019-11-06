

import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class dbConnection {	
	public static Connection dbConnector() {
		try {
			//first step to establish a database connection
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			//the second step is needed so that the login info is stored in one file "database.properties"
			//this properties object is used to give the input stream an input style
			Properties props = new Properties();
			
			//trying to read the "database.properties" file
			try(InputStream in = Files.newInputStream(Paths.get("./src/database.properties"))){
				props.load(in);
			}
			
			//sorting out the input
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("password");

			//returning the connection
			return DriverManager.getConnection(url, username, password);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "The program encountered a problem while connecting to the database");
			return null;
		}
		catch(IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "The program encountered a problem while accessing the database");
			return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "The program encountered a problem");
			return null;
		}
	}
	
}
