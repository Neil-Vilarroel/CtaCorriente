import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    
    // Cambia estos valores seg�n la configuraci�n de tu base de datos
    private static final String DB_URL = "jdbc:mysql://localhost:3308/bancoplatinium";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    
    @Test
    public void testDatabaseConnection() {
        Connection conn = null;
        try {
            // Intenta conectarte a la base de datos
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            // Si la conexi�n es exitosa, no deber�a lanzar excepciones
            assertNotNull(conn);
        } catch (SQLException e) {
            // Captura cualquier excepci�n de SQL que pueda ocurrir durante la conexi�n
            fail("Error de conexi�n a la base de datos: " + e.getMessage());
        } finally {
            // Cierra la conexi�n despu�s de la prueba, si se abri�
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Maneja cualquier error al cerrar la conexi�n
                    fail("Error al cerrar la conexi�n: " + e.getMessage());
                }
            }
        }
    }
}
