package 조건문기초;

import java.util.Scanner;

public class ex03단순if문예제 {

	public static void main(String[] args) {
		// 1. 정수를 입력하세요를 출력
		System.out.print("정수를 입력하세요 : ");
		
		// 2. 입력받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 3. 입력받은 값이 3과 5의 배수이라면 3과 5의 배수입니다를 출력
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}
		
		if(num % 15 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}
		
		
		// 첫번쨰 방법
		// 1. 출력
		// System.out.print("정수를 입력하세요 : ");
		// 2. 숫자를 입력
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		// 3. 3과 5의 배수인지 조건 판단
		// if(num % 3 == 0 && num % 5 == 0) {
			// 4. 만약에 조건이 참이라면, 3과 5의 배수입니다를 출력
			// System.out.println("3과 5의 배수입니다.");
		// }

		// 두번째 방법(중첩 if문 --> if문 안에 if문이 들어가있는 로직)
		 if(num %3 == 0) {
		 	if(num % 5 == 0) {
		 		System.out.println("3과 5의 배수입니다.");
			 }
		 }
		
		
		
	
		
		
		
		
		
		
		
		

	}
	
}








