package switch문;

import java.util.Scanner;

public class ex03예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 월 입력을 출력, 입력받기
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		// 2. 몇 월인지 판단하기
		switch(month) {
		// 3. 12, 1, 2월은 겨울입니다!를 출력
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다!");
			break; 
			// 4. 3, 4, 5월은 봄입니다!를 출력
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다!");
			break;
			// 5. 6, 7, 8월은 여름입니다!를 출력
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다!");
			break; 
			// 6. 9, 10, 11월은 가을입니다!를 출력
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다!");
			break;
		
		}
		
		
	}

}
