package _09_dependency_injection;

// 게시판 목록을 관리하는 기능을 제공하는 클래스
// save, delete 제공
import _09_dependency_injection.IBoardRepository;

public class BoardService {
//    private final IBoardRepository repository;
//
//    // 현재 외부에서 생성된 IBoardRepository를 불러오고 사용하고 있음.
//    public BoardService(IBoardRepository repository) {
//        this.repository = repository;
//    }


    // 2. setter를 이용한 DI
    private IBoardRepository repository;
    public void setIBoardRepository(IBoardRepository repository) {
        this.repository = repository;
    }
    public void save() {
        repository.save();
    }
    public void delete() {
        repository.delete();
    }
}
