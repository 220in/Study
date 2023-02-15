package 산술연산자;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// ex 1-5) 산술연산자 예제
		
		// 1. 정수형 데이터 2개 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번쨰 정수입력 : ");
		int num2 = sc.nextInt();
		
		// 2. 산술 연산 결과 출력
		System.out.println("더한 결과 값 : " + (num1 + num2));
		System.out.println("뺀 결과 값 : " + (num1 - num2));
		System.out.println("곱한 결과 값 : " + (num1 * num2));
		System.out.println("나눈 결과 값 : " + (((double) num1) / num2));
		
		
		
		
		
		
		
		
		

	}

}
