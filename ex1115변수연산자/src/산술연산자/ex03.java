package 산술연산자;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// ex 1-6) 산술연산자 예제
		
		// 1. 입력 도구 꺼내오기
		
		// 2. 정수형 num을 선언
		//    사용자에게 값을 입력받기.
		
		// 3. num의 백의자리 이하는 버릴 수 있는 산술 연산 작성
		// 정수형 result 출력
		// ex) 456 ---> 400 
		
		// 1.
		Scanner sc = new Scanner(System.in);
		// 2.
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 3.
        int result2 = (num / 100 ) * 100;
        System.out.println("결과 확인 : " + result2);
		
		int result = num - num % 100;
		System.out.println("결과 확인 : " + result);
		
		
		
		
		
		
		
		
		
		

	}

}
