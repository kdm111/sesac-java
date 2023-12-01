package sesac.sesacspringboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IntroduceController {
    @GetMapping("/introduce/{name}")
    public String Ex1(
            @PathVariable("name") String name,
            Model model) {
        model.addAttribute("name", name);
        return "introduce";
    }
    @GetMapping("/introduce2")
    public String Ex2(
            @RequestParam(value="name") String name,
            @RequestParam(value="age") Integer age,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "introduce2";
    }
}
