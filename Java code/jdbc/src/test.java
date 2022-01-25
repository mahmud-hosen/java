
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class test {
    
    
    public static void main(String[]args) throws ClassNotFoundException, SQLException{
        
        String url="jdbc:mysql://127.0.0.1/youtube";
        String username="root";
        String password="";
        String query="SELECT * FROM info WHERE id=2;";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection=(Connection) DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        ResultSet result; 
        result = statement.executeQuery(query);
         
        result.next();
        String name=result.getString("name");
        System.out.println("Ans is "+name);
        connection.close();
        statement.close();
    }
    
}
