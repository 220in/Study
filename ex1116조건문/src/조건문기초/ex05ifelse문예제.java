package 조건문기초;

import java.util.Scanner;

public class ex05ifelse문예제 {

	public static void main(String[] args) {
		// 1. 점수를 입력하세요를 출력
		System.out.print("점수를 입력하세요. : ");
		
		// 2. 점수 입력받기
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		// 3. 만약 점수가 60이상이라면 합격입니다를,
		//    60이하라면 불합격입니다를 출력
		if(grade >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	
			
		// 1. 출력
//		System.out.print("점수를 입력하세요 : ");
		// 2. 입력 
//		Scanner sc = new Scanner(System.in);
//		int grade = sc.nextInt();
		// 3. 입력받은 값이 60점 이상이라면 합격입니다를 출력
//		if(grade >= 60) { 
//			System.out.println("합격입니다.");
//		} else {
			// 4. 그렇지 않은 경우 불합격입니다를 출력하는 프로그램
//			System.out.println("불합격입니다.");
//		}
		

		
		
		
 
		
		
		
		
		
		
		
		
		
		
	}

}
