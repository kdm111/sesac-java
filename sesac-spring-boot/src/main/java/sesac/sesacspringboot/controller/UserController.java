package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import sesac.sesacspringboot.controller.vo.UserVO;

@Controller
public class UserController {
    @GetMapping("/user")
    public String userPage() {
        return "userRegister";
    }
    @PostMapping("/user/register")
    @ResponseBody
    public String userRegister (
            @RequestBody UserVO userVO
    ) {
        return userVO.getName() + "님 회원가입 성공";
    }
}
