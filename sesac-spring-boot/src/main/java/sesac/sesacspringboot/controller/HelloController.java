package sesac.sesacspringboot.controller;
//import ch.qos.logback.core.model.Model;
import java.util.Arrays;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@Controller
public class HelloController {
    class Hello {
        private int age;

        public Hello(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }
    @GetMapping("/hi")
    public String getHi(Model model) {
        // Model model
        // 컨트롤러 클래스의 메서드가 파라미터로 받을 수 있는 객체
//        model.addAttribute("msg", "hi~~ 방가방가");
//        return "hi";
        Hello hello = new Hello(10);
        List<String> names = Arrays.asList("kim", "lee", "park");
        model.addAttribute("hello", "spring world");
        model.addAttribute("sHello", "<strong>hello world</strong>");
        model.addAttribute("value", "이름을 입력하세요");
        model.addAttribute("withValue", "hello");
        model.addAttribute("link", "hi");
        model.addAttribute("imgSrc", "express.png");
        model.addAttribute("userRole", "admin");
        model.addAttribute("isAdmin", "false");
        model.addAttribute("names", names);
        model.addAttribute("classHello", hello);
        return "hi";
    }

}
