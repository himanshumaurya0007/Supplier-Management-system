
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_connect {

    private static String url;

    //public static Connection main(String args[ ])
    public Connection Open() {
        String host = "jdbc:mysql://localhost/";
        String dbName = "tanmay_project_db_2023_24";
        String username = "root";
        String password = "2711";
        url = host + dbName + "?user=" + username + "&password=" + password;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(url);
            System.out.println("Succeed!");
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found!");
        } catch (SQLException ex) {
            System.out.println("SQL exception!");
        }

        return null;
    }

    public void db_Cloase(Connection con) throws SQLException {
        con.close();
        return;
    }

}
