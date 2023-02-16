package 삼항연산자;

import java.util.Scanner;

public class ex02예제 {

	public static void main(String[] args) {
		// ex 6-2) 삼항연산자 예제
		//정수를 입력받아서 홀수/짝수를 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println((num%2)==0 ? num + "는(은)짝수입니다." : num + "는(은)홀수입니다.");
				
		// 1. 정수 입력받기.
        // Scanner sc = new Scanner(System.in);
		// System.out.print("정수 입력 : ");
        // int num = sc.nextInt();
        // 2. 홀수/짝수 판별하기.	
		// System.out.println(num % 2==0 ? num + "는(은)짝수입니다." : num + "는(은)홀수입니다.");
	    // 조건문 ---> boolean 타입으로 작성*
	
		

		
		
		
		
		

	}

}
