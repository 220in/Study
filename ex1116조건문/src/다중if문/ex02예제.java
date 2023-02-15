package 다중if문;

import java.util.Scanner;

public class ex02예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 점수 입력을 출력
		System.out.print("점수 입력 : ");
		
		// 2. 입력 받기
		int totalScore = sc.nextInt();
		
		// 3. 만약 totalscore가 90점 이상일 경우 A학점입니다를 출력
		if (totalScore >= 90) {
			System.out.println("A학점입니다.");
			// 4. 만약 80점 이상 90점 미만일 경우 B학점입니다를 출력
		}else if (totalScore >= 80) {
			System.out.println("B학점입니다.");
			// 5. 만약 70점 이상 90점 미만일 경우 C학점입니다를 출력
		}else if (totalScore >= 70) {
			System.out.println("C학점입니다.");
			// 6. 만약 70점 미만일 경우 D학점입니다를 출력
		}else {
			System.out.println("D학점입니다.");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력 :");
//		int totalScore = sc.nextInt();
//		char grade = 'a';
//		if(totalScore >= 90) {
//			grade = 'A';
//		}else if(totalScore >= 80) {
//			grade = 'B';
//		}else if(totalScore >= 70) {
//			grade = 'C';
//		}else {
//			grade = 'D';
//		}
//		System.out.println(grade + "학점입니다.");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
