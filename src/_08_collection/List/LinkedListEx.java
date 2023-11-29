package _08_collection.List;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> linekdList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();
        // 시작 끝 변수 선언
        long startTime;
        long endTime;
        // ArrayList의 0번 인덱스 데이터 추가 (10000회 반복)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        // LinkedList에 0번 인덱스 데이터 추가 10000회 반복

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linekdList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        // ArrayList는  기존값을 미루는 O(n)의 시간복잡도를 가지지만 LinkedList는 삽입 삭제시 O(1)의 시간 복잡도를 가짐
        // 조회 시에는 ArrayList 는 O(1)이지만 LinkedList는 O(n)의 시간 복잡도를 가진다.
        // ArrayList는

    }


}
