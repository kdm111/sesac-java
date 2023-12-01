package _08_collection.Ex;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Ex1 {

    public static void main (String[] args) {
        System.out.println("정수를 입력하세요 -1을 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while (true) {
            System.out.println("정수 입력 : ");
            int i = sc.nextInt();
            if (i == -1) {
                break;
            }
            set.add(i);
        }
        System.out.println("중복 제거된 정수 목록 : " + set);
    }
}
