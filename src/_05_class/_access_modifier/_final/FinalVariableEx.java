package _05_class._access_modifier._final;

// final은 한번 선언되면 값 변경이 불가능하다.
public class FinalVariableEx {
	static final double PI = 3.141592;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 1;
//		i = 5; // 변경이 불가능
		// final field는 오로지 읽기 전용으로만 쓰인다.
		
	}

}
