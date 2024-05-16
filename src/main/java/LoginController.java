import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Devuelve el nombre de la vista HTML para mostrar el formulario de inicio de sesi�n
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, 
                        @RequestParam("password") String password) {
        // Aqu� ir�a la l�gica para autenticar al usuario utilizando el nombre de usuario y la contrase�a
        // Por ahora, simplemente devolvemos una cadena de texto indicando que el usuario ha iniciado sesi�n correctamente
        return "redirect:/home"; // Redirige al usuario a la p�gina de inicio despu�s de iniciar sesi�n correctamente
    }
}
