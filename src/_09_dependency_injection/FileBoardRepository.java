package _09_dependency_injection;

// 파일 목록을 저장하는 클래스

public class FileBoardRepository implements IBoardRepository{
    public void save() {
        System.out.println("file save");
    }
    public void delete() {
        System.out.println("file delete");
    }
}
