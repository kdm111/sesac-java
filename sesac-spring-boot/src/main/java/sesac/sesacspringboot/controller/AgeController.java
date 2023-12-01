package sesac.sesacspringboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AgeController {
    @GetMapping("/age")
    public String getAge(Model model) {
        model.addAttribute("age", 30);
        return "age";
    }
}
