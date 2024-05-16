import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    
    // Cambia estos valores según la configuración de tu base de datos
    private static final String DB_URL = "jdbc:mysql://localhost:3308/bancoplatinium";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    
    @Test
    public void testDatabaseConnection() {
        Connection conn = null;
        try {
            // Intenta conectarte a la base de datos
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            // Si la conexión es exitosa, no debería lanzar excepciones
            assertNotNull(conn);
        } catch (SQLException e) {
            // Captura cualquier excepción de SQL que pueda ocurrir durante la conexión
            fail("Error de conexión a la base de datos: " + e.getMessage());
        } finally {
            // Cierra la conexión después de la prueba, si se abrió
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Maneja cualquier error al cerrar la conexión
                    fail("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
