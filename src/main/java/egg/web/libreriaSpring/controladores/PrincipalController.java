
package egg.web.libreriaSpring.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/")
    public String principal(){
  
    return "index.html";
    }
    
    
    
}
