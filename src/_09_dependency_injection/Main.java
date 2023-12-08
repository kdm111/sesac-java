package _09_dependency_injection;

public class Main {
    public static void main(String[] args) {

        // 1. 생성자를 이용한 DI
        // Autowired를 사용하지 않고 의존성을 주입함.
//        IBoardRepository repository = new FileBoardRepository();
//        BoardService service = new BoardService(repository);
//
//        service.save();
//        service.delete();

        // 2. setter를 이용한 의존성 주입
        // 만약 repository
//        IBoardRepository repository = new FileBoardRepository(); // file
        IBoardRepository repository = new DbBoardRepository(); // file
        BoardService service = new BoardService();
        service.setIBoardRepository(repository);

        service.save();
        service.delete();

        // spring에서는 Autowired를 통해서 한 방에 하게 해준다.
    }
}
