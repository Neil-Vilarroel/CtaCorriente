import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Devuelve el nombre de la vista HTML para mostrar el formulario de inicio de sesión
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, 
                        @RequestParam("password") String password) {
        // Aquí iría la lógica para autenticar al usuario utilizando el nombre de usuario y la contraseña
        // Por ahora, simplemente devolvemos una cadena de texto indicando que el usuario ha iniciado sesión correctamente
        return "redirect:/home"; // Redirige al usuario a la página de inicio después de iniciar sesión correctamente
    }
}
