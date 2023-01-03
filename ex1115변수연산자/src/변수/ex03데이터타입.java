package 변수;

public class ex03데이터타입 {

	public static void main(String[] args) {
		//암기* byte short int long float double char boolean
		
		// 자바의 기본 자료형
		// 1. boolean(논리형)
		// ---> 참 혹은 거짓을 저장하는 자료형 (1byte)
		// 참이라는 데이터를 저장하는 변수 bool를 선언하세요
		boolean bool = true;
		bool = false;
		System.out.println(bool);
		
		// 2. char(문자형)
		// ---> 2byte '' 사용한다. 한글자만 들어갈 수 있다.
		char name = '이';
		// 여러개의 글자를 저장하고 싶을 때 사용하는 자료형
		// String (기본 자료형이 아님*)
		String name2 = "이채영";
		
		// 3. 정수형 타입
		// 각각 자료형의 크기는 표형할 수 있는 범위를 의미한다.
		// 3-1) byte (1byte)
		// 3-2) short (2byte)
		// 3-3) int (4byte)
		// 3-4) long (8byte)
		
		byte num1 = (byte) 128;  // (2)
		long num2 = 1000;  // (1)
		// 자바에서의 형변환
		// 1) 자동 형 변환(암묵적 형 변환)
		// : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형 변환
		// 2) 강제 형 변환(명시적 형 변환)
		// : 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용하는 형 변환
		// : 데이터 손실이 발생할 수 있기 때문에 정확하게 () 사용해서  
		//   손실이 일어나도 괜찮다고 명시해주는 방식
		System.out.println(num1);
		System.out.println(num2);
		
		// 4. 실수형 
		// 4-1) float (4byte)
		// 4-2) double (8byte) ---> 소수점 기본은 double*
		double num3 = 3.14;
		float num4 = (float) 3.14; 
		float num5 = 3.14f;

		
		
		
		
		

	}

}
