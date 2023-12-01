package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
    @GetMapping("form")
    public String form() {
        return "form";
    }
    @PostMapping("form/result")
    @ResponseBody
    public String result(
            @RequestParam(value="name") String name,
            @RequestParam(value="gender") String gender,
            @RequestParam(value="year") String year,
            @RequestParam(value="month") String month,
            @RequestParam(value="day") String day,
            @RequestParam(value="interest", required = false) String[] interest
    ) {
//       Object o = new Objects();
        String g = gender.equals("man") ? "남자" : "여자";
        String interests = interest != null ? String.join(", ", interest) : "없음";
        return String.format(
                "이름 : %s <br/> 성별 : %s <br/> 생년월일 : %s-%s-%s <br /> 취미 : %s", name, g, year, month, day, interests);
    }
}
