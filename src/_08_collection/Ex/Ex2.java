package _08_collection.Ex;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        Map<String, Integer> map = new HashMap<>();
        Scanner sc  = new Scanner(System.in);
        while (true) {
            System.out.print("이름 입력 : ");
            String name = sc.nextLine();
            if (name.equals("종료")) {
                sc.close();
                break ;
            }
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            sc.nextLine();
            map.put(name, age);

        }
        System.out.println("=== 입력 받은 이름과 나이 목록 ===");
        for (String key : map.keySet()) {
            System.out.printf("이름 : %s, 나이 : %d\n", key, map.get(key));
        }

    }
}
