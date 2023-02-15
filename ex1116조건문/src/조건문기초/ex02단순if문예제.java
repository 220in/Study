package 조건문기초;

import java.util.Scanner;

public class ex02단순if문예제 {

	public static void main(String[] args) {
		// 1. 나이를 입력하세요를 출력
	    System.out.print("나이를 입력하세요 : ");
	    
		// 2. 사용자에게 나이 입력받기
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		// 3. 입력값이 20이상인지 아닌지 판단하는 로직
		boolean bool = age >= 20; // 생략 가능 ---> age >= 20이 조건문 역할
		
		// 4. 만약 나이가 20 보다 크거나 같다면 성인입니다 출력
		if(bool) {
			System.out.println("성인입니다.");
		}
		
		
		// 1. 나이를 입력하세요를 출력 (줄바꿈 없이)
		// System.out.print("나이를 입력하세요 : ");
		// 2. 정수형 데이터 입력받기
		// 2-1) 입력받는 도구 꺼내오기
		// Scanner sc = new Scanner(System.in);
		// 2-2) 입력받기
		// int age = sc.nextInt();
		// 3. 20보다 입력받은 데이타가 크다면, 성인입니다를 출력
		// if(age >= 20) {
		//	System.out.println("성인입니다.");
		// }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
