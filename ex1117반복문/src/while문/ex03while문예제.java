package while문;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class ex03while문예제 {

	public static void main(String[] args) {

		// 1. 정수 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		int plus = 0;
		while (true) {
			// 2. 정수 입력 출력하기
			System.out.print("정수 입력 : ");

			// 3. 정수 입력받기
			int num = sc.nextInt();

			// 4. 입력받은 정수를 누적하기
			// ---> 누적할 변수가 하나 필요
			plus = num+plus;
			System.out.println("누적결과 : " + plus);

			// 5. 2~4구간 반복, -1이 나왔을 때 종료되었습니다 출력
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;

			}

		}

//		// 1. 입력받은 도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		while (true) {
//			// 2. 정수 입력 출력하기 (줄바꿈 없이)
//			System.out.print("정수 입력 : ");
//			// 3. 정수 입력하기
//			int input = sc.nextInt();
//			// 4. 입력받은 정수를 누적하기
//			// ---> 누적할 변수 하나 필요
//			sum += input;
//			System.out.println("누적결과 : " + sum);
//			// 5. 2~4까지 반복, -1을 입력하면 종료되었습니다 출력 후 프로그램 끝
//			if (input == -1) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//		}

	}

}
