package _09_dependency_injection;
public class DbBoardRepository implements IBoardRepository{
    public void save() {
        System.out.println("db save");
    }
    public void delete() {
        System.out.println("db delete");
    }
}
