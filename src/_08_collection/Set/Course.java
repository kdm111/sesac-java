package _08_collection.Set;

import java.util.Objects;

public class Course {
    private int id;
    private String title;

    public void Course(int id, String title) {
        this.id = id;
        this.title = title;
    }
    // 객체의 메모리 주소를 기반으로 한 정수값의 해쉬코드
    // hashCoe() : object 클래스가 정의되어 있고, 객체의 해시코드를 반환하는 역할
    // Course에서 hashCode 재정의: 객체 내부 상태를 기반으로 해시 코드 생성
    @Override
    public int hashCode() {
        // title은 String이므로 해시코드 사용가능
        // id는 int이므로 정수값의 해시코드에 더하기 연산
        // id와 title이 같다면 동일한 hashCode 리턴
        return this.title.hashCode() + this.id;
    }
    // id, title이 같다면 true 리턴
    @Override
    public boolean equals(Object o) {
        if (o instanceof Course target) {
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return String.format("id : %d, title : %s", this.id, this.title);
    }


}
