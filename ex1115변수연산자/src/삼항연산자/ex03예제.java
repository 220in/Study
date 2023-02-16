package 삼항연산자;

import java.util.Scanner;

public class ex03예제 {

	public static void main(String[] args) {
		// ex 6-3) 삼항연산자 예제
		// 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺸 결과값을 출력하기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번쨰 정수 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.println((n1 > n2) ? "두 수의 차 :" + (n1-n2) : "두 수의 차 :" + (n2-n1));
		
		// 더 큰 수에서 작은 수를 뺴는 프로그램을 만들어보자
		// 1. 두 개의 정수 입력받기
        // Scanner sc = new Scanner(System.in);
        // System.out.print("첫 번째 정수 입력 : ");
        // int n1 = sc.nextInt();
        // System.out.print("두 번쨰 정수 입력 : ");
        // int n2 = sc.nextInt();
		// 2. 큰 수와 작은 수를 구별하여 뺀 정수형 결과값 만들기
        // int result = n1 > n2 ? n1 - n2 : n2 - n1; 
        // 3. 결과값 출력하기
        // System.out.println("두 수의 차 : " + result);
		
		
		
		
		
		
		
		

	}

}
