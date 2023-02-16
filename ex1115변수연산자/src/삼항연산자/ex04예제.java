package 삼항연산자;

import java.util.Scanner;

public class ex04예제 {

	public static void main(String[] args) {
		// ex 6-4) 삼항연산자 예제 
		// 농구공을 담기 위해 필요한 개수를 구하는 프로그램을 만들어보자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int n = sc.nextInt();
		
		System.out.print("필요한 상자의 수 : ");
	    int result = (n%5) == 0 ? n/5 : n/5 + 1;
		
	    System.out.println(result);
	    
		
		// 1. 농구공의 개수를 입력하세요를 출력
	    // System.out.print("농구공의 개수를 입력하세요 : ");
	    // 2. 정수형 숫자를 입력
	    // 2-1) 입력받는 도구 꺼내오기
	    // Scanner sc = new Scanner(System.in);
	    // 2-2) 입력받기
	    // int ball = sc.nextInt();  
	    // 3. 필요한 상자의 수를 구하는 로직
	    // 조건식 ? 참이었을 떄 실행하는 구문 : 거짓이었을 때 실행하는 구문
	    // int result = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
	    // 4. 결과값을 출력
        // System.out.println("필요한 상자의 개수 : " + result);
	    
	    
		
		
		
		
		
		
		
		
		

	}

}
