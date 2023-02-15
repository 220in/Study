package switch문;

import java.util.Scanner;

public class ex02예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 점수 입력을 출력
		System.out.print("점수 입력  : ");
		// 2. 점수 입력받기
		int totalScore = sc.nextInt();
		// 3. 만약 90점 이상이면 A학점입니다를 출력
		switch(totalScore / 10) {
		case 10:
			System.out.println("A학점입니다."); // ---> case 9에서 걸리기 때문에 생략 가능
			break;
		case 9:
			System.out.println("A학점입니다.");
			break;
			// 4. 만약 80점 이상 90점 미만이면 B학점입니다를 출력 
		case 8:
			System.out.println("B학점입니다.");
			break;
			// 5. 만약 70점 이상 80점 미만이면 C학점입니다를 출력
		case 7:
			System.out.println("C학점입니다.");
			break;
			// 6. 만약 70점 미만이면 D학점입니다를 출력
		default :
			System.out.println("D학점입니다.");
			break;
		
		
		
		
		
		
		
		
		
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
