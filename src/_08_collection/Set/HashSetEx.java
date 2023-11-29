package _08_collection.Set;
import java.util.HashSet;
import java.util.Set;
//import _08_collection.Set.Course;
public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("d");
        System.out.println(set1);

//        Course a = new Cource(1, "1");
//        Course b = new Cource(1, "1");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        Set<Course>
//
//        for (Course c :  set1) {
//            System.out.println(c);
//        }
//        Iterator<Course> iterator = set1.iterator();
//        // hasNext() 가져올 객체가 있다면 true
//        // next collection에서 객체 하나를 가져오는 메서드
//        // remove  next로 가져온 객체를 set에서 제거
//        while (iterator.hasNext()) {
//            course c = iterator.next();
//            System.out.println(c);
//        }

    }

}
