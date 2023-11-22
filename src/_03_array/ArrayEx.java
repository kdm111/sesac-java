package _03_array;
import java.util.Arrays;
import java.util.Scanner;

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
//		int[][][] Array3d = {{{1,2},{3,4}}, {{5,6},{7,8}}};
//		for (int i = 0; i < Array3d.length; i++) {
//			for (int j = 0; j < Array3d[i].length; j++) {
//				for (int k = 0; k < Array3d[i][j].length; k++) {
//					System.out.print(Array3d[i][j][k] + " ");
//				}
//				System.out.print("  ");
//		}
//			System.out.println();
//		}
		
		// 객체를 참조하는 배열
		// - 기본 타입 배열 : 각 원소의 값이 저장
		// - 참조 타입 배열 : 각 원소에 참조값이 저장
		
//		String[] langs = new String[3];
//		langs[0] = "Java";
//		langs[1] = "Java";
//		langs[2] = new String("Java");
//		// 문자열 리터럴은 string pool에서 저장되는   
//		// 동일한 문자열 리터럴은 string pool에서 하나의 인스턴스로 관리된다.
//		// 동일한 문자열 리터럴에 대한 참조는 모두 고유한 인스턴스를 가리키게 된다.
//		System.out.println(langs[0] == langs[1]); // true
//		// new String();을 사용할 경우 string pool을 거치지 않고 
//		// heap 메모리 안에서 직접 객체가 생성된다. 따라서 각각 다른 참조를 가리키게 된다.
//		System.out.println(langs[0] == langs[2]); // false
		
		// Arrays methods
		
		// 배열 복사
		// java는 표준 배열은 크기가 고정되어 있다. -> 
		// 더 많은 저장공간이 필요하다면 더 큰 배열을 만들어서 복사하게 된다.
		
		//
//		int[] originArray = {1,2,3};
//		int[] newArray = new int[5];
//		int i = 0;
//		for (int num : originArray) {
//			newArray[i] = num;
//			i += 1;
//		}
//		System.out.println(Arrays.toString(newArray));
//		
//		// System.arraycopy
//		// ( obj src : 원본 배열, int srcPos :시작하는 인덱스, 
//		//obj dest :새로운 배열, int destPos : 새로운 배열 시작 인덱스 
//		// int length: 복사할 길이
//		
//		String[] strArray = {"apple", "banana", "cherry"};
//		String[] destArray = new String[5];
//		
//		System.arraycopy(strArray, 0, destArray, 0, strArray.length-1);
//		System.out.println("originalFruits : " + Arrays.toString(strArray));
//		System.out.println("newFruits : " + Arrays.toString(destArray));
		
		
//		// Arrays.copyof
//		// arr, length
//		
//		int[] originArr = {1,2,3,4,5};
//		int[] copyOfArr = Arrays.copyOf(originArr, originArr.length);
//		System.out.println(Arrays.toString(copyOfArr));
		
//		// Arrays.copyOfRange
//		// arr, sIdx, eIdx
//		int[] copyOfRangeArr = Arrays.copyOfRange(originArr, 1, 4);
//		System.out.println(Arrays.toString(copyOfRangeArr));
		
//		// Arrays.fill
//		// arr el
//		int[] fillArr = new int[5];
//		Arrays.fill(fillArr, 8);
//		System.out.println(Arrays.toString(fillArr));
		
		
//		// Arrays.sort
//		// arr 
//		int[] sortArr = {1,5,1,2,0};
//		Arrays.sort(sortArr);
//		System.out.println(Arrays.toString(sortArr));
		
//		// Arrays.equals
//		// arr1, arr2
//		int[] equalsArr1 = {1,2,3};
//		int[] equalsArr2 = {1,2,3};
//		int[] equalsArr3 = {2,3,4};
//		System.out.println(Arrays.equals(equalsArr1, equalsArr2)); // true
//		System.out.println(Arrays.equals(equalsArr1, equalsArr3)); // false
		
//		int[] equalsArr4 = equalsArr1;
//		System.out.println(Arrays.equals(equalsArr1, equalsArr4));
//		System.out.println(equalsArr1 == equalsArr4);
//		System.out.println(equalsArr2 == equalsArr4);
		
		// Arrays.deepEquals
		// 다차원 배열에서 비교
		// arr1, arr2
//		int[][] deepEqualsArr1 = {{1,2}, {3,4}};
//		int[][] deepEqualsArr2 = {{1,2}, {3,4}};
//		System.out.println(Arrays.equals(deepEqualsArr1, deepEqualsArr2)); // false
//		System.out.println(Arrays.deepEquals(deepEqualsArr1, deepEqualsArr2)); // true
		
		// Arrays.binarySearch
		// 정렬이 되어 있어야 하고 위치를 반환
		// 음수 일경우 못 찾은 것임.
		// arr, val
//		int[] binarySearchArr = {1,2,3,4,5,6,7};
//		System.out.println(Arrays.binarySearch(binarySearchArr, 9));
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		int idx = 0;
		int[] arr = new int[5];
		for (String el : temp) {
			arr[idx] = Integer.parseInt(el);
			idx += 1;
		}
		double avg = 0.0;
		for (int num : arr) {
			avg += num;
		}
		avg /= 5;
		System.out.println("평균은 : " + avg);
		
	}
}
