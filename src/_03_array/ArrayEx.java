package _03_array;
import java.util.Arrays;

// 배열에 저장할 자료 선언
// 배열 원소는 항상 같은 타입
// 초기화된 배열 크기는 변경이 불가능

public class ArrayEx {

	public static void main(String[] args) {
		// 1. 
//		int[] arr; // 추천
//		int arr2[];
		
//		// 배열 변수 참조값 null 표현가능
//		String[] temp = null;
//		System.out.println(temp);
//		// System.out.println(temp[1]); // null pointer exception
		
//		int[] intArray = {1, 2, 4, 4, 5};
//		intArray[1] = 10;
//		System.out.println(Arrays.toString(intArray));
		
//		char[] charArray;
//		charArray = new char[]{'A', 'B', 'C'};
		
		// new 연산자로 배열 선언/생성
		// 원소값은 기본값으로 초기화 됨
//		double[] doubleArray = new double[3]; // 0.0으로 초기화 됨
//		doubleArray[0] = 1.1;
//		doubleArray[1] = 1.2;
//		System.out.println(Arrays.toString(doubleArray));
//		
//		// 배열의 길이 length 는 읽기만 가능하다.
//		System.out.println(doubleArray.length);
//		
//		int sum = 0;
//		for (int num : intArray) {
//			sum += num;
//		}
//		System.out.println("sum : " + sum);
//		double avg = 0.0;
//		avg = (double) sum / intArray.length;
//		System.out.println("avg : "+ avg);

		
		// 다차원 배열
		// 2*3 배열
//		int[][] matrix = {{1,2,3}, {4,5,6}};
//		System.out.println(Arrays.toString(matrix[0]));
//		System.out.println(Arrays.toString(matrix[1]));
		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println("");
//		}
		
		// 3 * 2
		
//		int[][] matrix2 = new int[3][2];
//		matrix2[0][0] = 1;
//		matrix2[0][1] = 2;
//		matrix2[1][0] = 3;
//		matrix2[1][1] = 4;
//		matrix2[2][0] = 5;
//		matrix2[2][1] = 6;
//		
//		for (int i = 0; i < matrix2.length; i++) {
//		for (int j = 0; j < matrix2[i].length; j++) {
//			System.out.print(matrix2[i][j] + " ");
//		}
//		System.out.println("");
//	}
	
		// 3d array
		int[][][] Array3d = {{{1,2},{3,4}}, {{5,6},{7,8}}};
		for (int i = 0; i < Array3d.length; i++) {
			for (int j = 0; j < Array3d[i].length; j++) {
				for (int k = 0; k < Array3d[i][j].length; k++) {
					System.out.print(Array3d[i][j][k] + " ");
				}
				System.out.print("  ");
		}
			System.out.println();
		}
		
		
		
		
	}
}
