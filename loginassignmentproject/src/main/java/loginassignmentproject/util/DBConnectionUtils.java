package loginassignmentproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {
    public static final String URL="jdbc:postgresql://localhost:5432/bydb";
    public static Connection getDBConnection()
    {
        Connection conn=null;
        try
        {
            conn= DriverManager.getConnection(URL,"postgres","postgres");

        }
        catch(SQLException a)
        {
            throw new RuntimeException(a);
        }
        return conn;
    }

}