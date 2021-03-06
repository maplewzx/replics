package replics.impl.data.kernel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
  static Connection con = null;

  public static void main(String args[]) throws SQLException {
	  
	Connect();
	CreateDB();
	Disconnect();
	
    }
  

    private static void Connect() {
	try {
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      String url ="jdbc:mysql://localhost:3306/replics";
	      con = DriverManager.getConnection(url,"nicolas","secret");

	      if(!con.isClosed())
	        System.out.println("Successfully connected to MySQL server using TCP/IP...");

	    } catch(Exception e) {
	      System.err.println("Exception: " + e.getMessage());
	    }

    }
    
    private static void Disconnect() {
    	
    	      try {
    	        if(con != null)
    	          con.close();
    	      } catch(SQLException e) {}
    	
	
    }
    
    private static void CreateDB() throws SQLException {
    	
    	Statement stmt = con.createStatement();
    	
    	stmt.executeUpdate( "CREATE TABLE census ("  +
    	         "recordId    	INT    		NOT NULL, "    +
    	         "groupId    	VARCHAR(100)    NOT NULL, "    +
    	         "hash    		VARCHAR(100)    NOT NULL, "    +
    	         "xml   		TEXT 			NOT NULL, "    +
    	         "photo        	BINARY 			NOT NULL, "    +
    	         "fingerPrint	BINARY 			NOT NULL, "    +
    	         "height		FLOAT 			NOT NULL, "    +
    	         "PRIMARY KEY( recordID, groupId )"                  +
    	                                            ")" );
    	
    	System.out.println("Table successfully created...");
      }
}

//system....exec(url); pour executer un program
