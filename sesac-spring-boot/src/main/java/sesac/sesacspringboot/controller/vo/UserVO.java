package sesac.sesacspringboot.controller.vo;

import lombok.Getter;
import java.util.Arrays;

// vo는 getter만가지고 있다.
@Getter
public class UserVO {
    private String name;
    private String age;
    private String gender;
    private String birthDate;
    private String[] interests;

    @Override
    public String toString() {
        String interests = Arrays.toString(this.interests);
        return String.format("%s %s %s %s", this.name, this.gender, this.birthDate, interests);
    }
}
