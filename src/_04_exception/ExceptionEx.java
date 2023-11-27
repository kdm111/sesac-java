package _04_exception;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ExceptionEx {
    static class IndexOverException extends Exception {
        public IndexOverException(String message) {
            super(message);
        }
    }
    static class DuplicateException extends Exception {
        public DuplicateException(String message) {
            super(message);
        }
    }
	public static void main(String[] args) {
		// 에러 발생 가능한 구문
		
//		try {
//			System.out.println(divide(4, 0));
//		} catch (ArithmeticException e){
////			System.out.println("divided by 0" + e.getMessage()); // 에러 발생한 이유 보여줌
////			System.out.println("divided by 0" + e.toString()); // 에러 종류 리턴
//			e.printStackTrace(); // 에러 내용 추적 내용
//		} finally {
//			System.out.println("연산 종료");
//		}
//		
//		int[] numArr = {1,2,3,4,5};
//		try {
//			System.out.println(getValueofArr(numArr, 1000));
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("인덱스 종료");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int input;
//		try {
//			System.out.println("input num");
//			input = sc.nextInt();
//			System.out.println(input);
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("입력 종료");
//		}
		
//		int[] arr = {1,2,3,4};
//		try {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(arr[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스가 범위를 벗어났습니다.");
//		}
//		Scanner sc = new Scanner(System.in);
//		int input;
//		System.out.println("배열 크기를 입력해 주세요 :");
//		try {
//			input = Integer.parseInt(sc.nextLine());
//			if (input <= 0) {
//				throw new NegativeArraySizeException ("배열의 크기는 음수나 0이 될 수 없습니다.");
//			}
//			System.out.println("배열 요소를 입력해주세요 : ");
//			String line = sc.nextLine();
//			String[] temp = line.split(" ");
//			int total = 0;
//			int cnt = 0;
//			for (String el : temp) {
//				int tempEl = Integer.parseInt(el);
//				total += tempEl;
//				cnt += 1;
//			}	
//			System.out.println("입력하신 숫자들의 평균은 " + (double) (total / cnt));
//		} catch (InputMismatchException e) {
//			System.out.println("숫자를 입력해 주세요");
//		} catch (NegativeArraySizeException e) {
//			System.out.println(e.getMessage());
//		} catch (NumberFormatException e) {
//			System.out.println("배열에는 오직 숫자만 들어갈 수 있습니다.");
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		int input;
		List<Integer> numbers = new ArrayList<Integer>();
		Map<String, ArrayList<Integer>> map = new HashMap<>();
		System.out.println("배열 크기를 입력해 주세요 :");
		try {
			input = Integer.parseInt(sc.nextLine());
			if (input <= 0) {
				throw new NegativeArraySizeException ("배열의 크기는 음수나 0이 될 수 없습니다.");
			}
			System.out.println("배열 요소를 입력해주세요 : ");
			String line = sc.nextLine();
			String[] temp = line.split(" ");
			if (temp.length != input) {
				throw new IndexOverException ("입력하신 범위가 적절하지 않습니다.");
			}
			for (String el : temp)
			{
				int tempEl = Integer.parseInt(el);
				numbers.add(tempEl);
			}
			boolean isDuplicated = false;
			for(int i = 0; i < numbers.size(); i++) {
				ArrayList t = map.get(String.valueOf(numbers.get(i)));
				if (t != null) {
					t.add(numbers.get(i));
					isDuplicated = true;
				} else {
					ArrayList<Integer> newList = new ArrayList<>();
					newList.add(numbers.get(i));
					map.put(String.valueOf(numbers.get(i)), newList);
				}
			}
			if (isDuplicated) {
				throw new DuplicateException ("중복되는 수가 존재합니다.");
			}
			System.out.println("중복되는 수가 없습니다.");
			System.out.println(numbers);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해 주세요");
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("배열에는 오직 숫자만 들어갈 수 있습니다.");
		} catch (IndexOverException e) {
			System.out.println(e.getMessage());
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				if (map.get(key).size() > 1) {
					System.out.print(map.get(key) + " ");
				}
			}
		}
		sc.close();
		
	}
	public static String divide (int x, int y) {
		return "x / y == " + (float) (x / y); 
	}
	public static int getStringSize(String string) {
		return string.length();
	}
	public static int getValueofArr(int[] arr, int idx) {
		return arr[idx];
	}

}

