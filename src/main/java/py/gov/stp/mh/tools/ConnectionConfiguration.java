package py.gov.stp.mh.tools;
/**
 * @author		DGTIC-STP
 * @email		dgtic@stp.gov.py 
 *
 **/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import py.gov.stp.mh.tools.SqlHelper;

public class ConnectionConfiguration {
    public static final String URL = "jdbc:postgresql://pg01.stp.gov.py/spr?useUnicode=true&characterEncoding=UTF-8";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";
 
    public static Connection getConnection() {
  /*      Connection connection = null;
        try {
        	//Class.forName("com.mysql.jdbc.Driver");
	        Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return connection;
        */
	
		Connection con = null;
	    Statement st = null;
	    ResultSet rs = null;
	    try {Class.forName("org.postgresql.Driver");}
	    catch (ClassNotFoundException e) {e.printStackTrace();}
	    String url = "";
	    String user = "postgres";
	    String password = "postgres";
	
	    try {con = DriverManager.getConnection("jdbc:postgresql://pg01.stp.gov.py/spr?useUnicode=true&characterEncoding=UTF-8&user=postgres&password=postgres");}
	    catch (SQLException ex) {
	        Logger lgr = Logger.getLogger(SqlHelper.class.getName());
	        lgr.log(Level.SEVERE, ex.getMessage(), ex);
	    } 
	    return con;
    }
	
	
    public static Connection conectar(){
		/* Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;
	        //try {Class.forName("com.mysql.jdbc.Driver");}
	        try {Class.forName("org.postgresql.Driver");}
	        catch (ClassNotFoundException e) {e.printStackTrace();}
	        String url = "";
	        //String user = "root";
	        String user = "postgres";
	        String password = "postgres";

	        //try {con = DriverManager.getConnection("jdbc:mysql://mysql01.stp.gov.py/spr?useUnicode=true&characterEncoding=UTF-8", "root", "postgres");}
	        try {con = DriverManager.getConnection("jdbc:postgresql://pg01.stp.gov.py/spr?useUnicode=true&characterEncoding=UTF-8", "postgres", "postgres");}
	        catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(SqlHelper.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);
	        } 
	        return con;*/
    	Connection con = null;
	    Statement st = null;
	    ResultSet rs = null;
	    try {Class.forName("org.postgresql.Driver");}
	    catch (ClassNotFoundException e) {e.printStackTrace();}
	    String url = "";
	    String user = "postgres";
	    String password = "postgres";
	
	    try {con = DriverManager.getConnection("jdbc:postgresql://pg01.stp.gov.py/spr?useUnicode=true&characterEncoding=UTF-8&user=postgres&password=postgres");}
	    catch (SQLException ex) {
	        Logger lgr = Logger.getLogger(SqlHelper.class.getName());
	        lgr.log(Level.SEVERE, ex.getMessage(), ex);
	    } 
	    return con;
	}
    public static Connection conectarTablero(){
		 Connection con = null; 
	        Statement st = null;
	        ResultSet rs = null;
	        try {Class.forName("org.postgresql.Driver");}
	        catch (ClassNotFoundException e) {e.printStackTrace();}
	        String url = "";
	        String user = "postgres";
	        String password = "t3R3R3.ol";

	        try {con = DriverManager.getConnection("jdbc:postgresql://pg01.stp.gov.py/tablero2015v3?useUnicode=true&characterEncoding=UTF-8&user=postgres&password=t3R3R3.ol");}
	        catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(SqlHelper.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);
	        } 
	        return con;
	}
    
    
 
}
