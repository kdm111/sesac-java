package sesac.sesacspringboot.controller;
// spring boot가 정해저 있는 기능을 사용하는 것이며 컨트롤러를 명시하고 컨트롤러를 찾는다.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import sesac.sesacspringboot.controller.dto.UserDTO;
import sesac.sesacspringboot.controller.vo.UserVO;
@Controller
public class MainController {
    @GetMapping("/api")
    public String getApi() {
        return ("/request");
    }

    // 1) get method
    // 쿼리
    @GetMapping("/get/response1")
    // RequestParam parameter를 받을 때 사용
    // 검색, 해쉬 태그에 사용
    public String getResponse1(
            @RequestParam(value="name")  String n,
            @RequestParam(value="age", required = false) Integer age,
            Model model) {
        model.addAttribute("name",  n);
        if (age != null) {
            model.addAttribute("age", age);
        } else {
            model.addAttribute("age", "입력되지 않음");
        }
        return "response"; // templates파일의 이름명 리턴
    }
    // required 값이 필수가 아니라면 false로 넣고 초기화를 해야 한다.
    @GetMapping("/get/response2")
    public String getResponse2(
            @RequestParam(value="name", required = true)  String name,
            @RequestParam(value="age", required = false) int age,
            Model model) {
        model.addAttribute("name",  name);
        return "response";
    }
    @GetMapping("/get/response3/{name}/{age}")
    public String getResponse3(
            @PathVariable("name") String n,
            @PathVariable Integer age,
            Model model) {
        model.addAttribute("name",  n);
        model.addAttribute("age", age);
        return "response";
    }
    // age 경로가 존재하지 않을 경우를 대비하여 객체로 담을 수 있다.
    // 당연히 앞에서 부터 매핑되므로 뒤로 가야 한다.
    @GetMapping({"/get/response4/{name}", "/get/response4/{name}/{age}"})
    public String getResponse4(
            @PathVariable(value="name") String name,
            @PathVariable(required = false) Integer age,
            Model model) {
        model.addAttribute("name",  name);
        if (age != null) {
            model.addAttribute("age", age);
        } else {
            model.addAttribute("age", "나이는 입력되지 않음");
        }
        return "response";
    }
    @PostMapping("/post/response1")
    public String postResponse1(
            @RequestParam(value="name") String name,
            Model model) {
        model.addAttribute("name", name);
        return "response";
    }
    @PostMapping("/post/response2")
    public String postResponse2(
            @RequestParam(value="name", required = false) String name,
            Model model) {
        model.addAttribute("name", name);
        return "response";
    }
    //@RestController // Controller 면서 모든 메소드가 @ResponseBody를 붙이도록 만드는 도구
    @PostMapping("/post/response3")
    @ResponseBody // 값 그 자체로 전달
    // return 값 그대로를 전달한다. template를 보내는 것이 아니라.
    public String postResponse3(
            @RequestParam(value="name", required = false) String name,
            Model model) {
        model.addAttribute("name", name);
        return "hello " + name;
    }
    @GetMapping("/dto/response1")
    @ResponseBody
    public String dtoResponse1(@ModelAttribute UserDTO userDTO) {
        // 변수로 값을 가져오는 것이 아니라 객체에 값을 담아서 가져오는 방법
        // @ModelAttribute : html 폼 데이터를 컨트롤러로 전달할 때 객체에 매핑해주는 어노테이션
        // 매핑 ==> setter를 사용

        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }
//    @PostMapping("/dto/response2")
//    @ResponseBody
//    public String dtoResponse2(UserDTO userDTO) {
//        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
//        return msg;
//    }
    @PostMapping("/dto/response2")
    @ResponseBody
    public String dtoResponse2(UserDTO userDTO) {
        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }
    @PostMapping("/dto/response3")
    @ResponseBody
    public String dtoResponse3(@RequestBody UserDTO userDTO) {
        // @RequestBody 요청의 본문에 있는 데이터(body)를 받아와서 객체에 매핑 (필드값에 주입)
        // 전달받은 요청의 형식이 json or xml일 때만 사용가능하다.
        // 일반 폼 전송의 경우 www-x-form-urlencoded 이다.

        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }

    @GetMapping("/vo/response1")
    @ResponseBody
    // @ModelAttribute는 setter함수를 사용하므로 VO에서는 사용할 수 없다.
    public String voResponse1(@ModelAttribute UserVO userVO) {
        // ModelAttribte는 객체 필드값에 값을 매핑하기 위해 setter를 사용한다.
        // setter를 가지고 있지 않아서 매핑을 할 수가 없다.
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    @PostMapping("/vo/response2")
    @ResponseBody
    public String voResponse2(UserVO userVO) {
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    @PostMapping("/vo/response3")
    @ResponseBody
    public String voResponse3(UserVO userVO) {
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    // axios get 일반
    // axios.get dto > 0
    //
    @GetMapping("/axios/response1")
    @ResponseBody
    public String axiosAPI1(
            @RequestParam(value="name") String name,
            @RequestParam(value="age") String age
    ) {
        String msg = "이름 " + name + "<br />" + "나이 " + age;
        return msg;
    }
    @GetMapping("/axios/response2")
    @ResponseBody
    public String axiosAPI2(
            UserDTO userDTO
    ) {
        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }
    // form을 통해 데이터를 요청할 때 일반적으로 x-www-form-urlencoded로 RequestParam으로 받을 수 있음
    // required가 false일때는 null 아닐 경우 error
    @PostMapping("/axios/response3")
    @ResponseBody
    // requestParam은 post로 읽을 수 없음
    public String axiosAPI3(
            @RequestParam(value="name") String name,
            @RequestParam(value="age") String age
    ) {
        String msg = "이름 " + name + "<br />" + "나이 " + age;
        return msg;
    }
    // RequestBody가
    @PostMapping("/axios/response4")
    @ResponseBody
    public String axiosAPI4(
        UserDTO userDTO
    ) {
        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }
    @PostMapping("/axios/response5")
    @ResponseBody
    public String axiosAPI5(
            @RequestBody UserDTO userDTO
    ) {
        String msg = "이름 " + userDTO.getName() + "<br />" + "나이 " + userDTO.getAge();
        return msg;
    }
    @GetMapping("/axios/vo/response1")
    @ResponseBody
    public String axiosVoAPI1(
            @RequestParam(value="name") String name,
            @RequestParam(value="age") String age
    ) {
        String msg = "이름 " + name + "<br />" + "나이 " + age;
        return msg;
    }
    @GetMapping("/axios/vo/response2")
    @ResponseBody
    public String axiosVOAPI2(
            UserVO userVO
    ) {
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    // form을 통해 데이터를 요청할 때 일반적으로 x-www-form-urlencoded로 RequestParam으로 받을 수 있음
    // required가 false일때는 null 아닐 경우 error
    @PostMapping("/axios/vo/response3")
    @ResponseBody
    // requestParam은 post로 읽을 수 없음
    public String axiosVOAPI3(
            @RequestParam(value="name") String name,
            @RequestParam(value="age") String age
    ) {
        String msg = "이름 " + name + "<br />" + "나이 " + age;
        return msg;
    }
    // RequestBody가
    @PostMapping("/axios/vo/response4")
    @ResponseBody
    public String axiosVOAPI4(
            UserVO userVO
    ) {
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    @PostMapping("/axios/vo/response5")
    @ResponseBody
    public String axiosVOAPI5(
            @RequestBody UserVO userVO
    ) {
        String msg = "이름 " + userVO.getName() + "<br />" + "나이 " + userVO.getAge();
        return msg;
    }
    // 데이터 형식과 위치: @ModelAttribute는 주로 폼 데이터나 쿼리 파라미터에서 데이터를 받는 반면,
    // @RequestBody는 HTTP 요청의 본문에서 JSON, XML 같은 구조화된 데이터를 받습니다.

    // 처리 방법: @ModelAttribute는 요청 파라미터의 이름과 객체 필드의 이름을 기반으로 자동 바인딩을 수행하는 반면,
    // @RequestBody는 요청 본문을 객체로 변환하기 위해 JSON/XML 파서를 사용합니다.

}
