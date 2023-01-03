package 산술연산자;

public class ex01개념 {

	public static void main(String[] args) {
		// 변수 선언 : 자료형 변수명 = 값;
		int num1 = 7;
		int num2 = 3;
		
		// 산술연산
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		// 숫자, 문자 산술연산
		int num3 = 4;
		String num4 = "1";
		System.out.println(num3 + num4);
		// System.out.println(num3 - num4); ---> X
		// 1. 더하기 연산만 가능하다.
		// 2. 숫자 + 문자열을 연산하면 결과는 문자열 형태로 출력된다.
		// ex) System.out.println(num3 + num4) : 41
		
		
		
		
		
		
		

	}

}
