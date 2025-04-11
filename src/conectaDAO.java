
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;

      try {
            String url = "jdbc:mysql://localhost:3306/leiloesUC11";
            String user = "root";
            String password = "Mysql_1234";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com banco de dados realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }

        return conn;
    }
}
