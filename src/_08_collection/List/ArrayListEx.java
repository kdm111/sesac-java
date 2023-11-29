package _08_collection.List;
import java.util.List;
import java.util.ArrayList;
import _08_collection.List.Book;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("1", "1"));
        list.add(new Book("2", "2"));
        list.add(new Book("3", "3"));
        list.add(new Book("4", "4"));
        list.add(new Book("5", "5"));

        int size = list.size();
        System.out.println(size);

        // 특정 객체 가져오기
        // list.get(2);

    }
}
