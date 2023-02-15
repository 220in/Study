package while문;

import java.util.Scanner;

public class ex04홀짝개수구하기 {

	public static void main(String[] args) {

		// 1. 정수 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 홀수개수 변수와 짝수개수 생성
		// (while문 안에 넣게되면 변수의 값이 계속 0이 되는 것이 반복되기 때문)
		int sum1 = 0;
		int sum2 = 0;
		while (true) {
			// 2. 숫자 입력 출력하기
			System.out.print("숫자 입력 : ");

			// 3. 정수 입력받기
			int num = sc.nextInt();

			// 4. 입력 받은 정수가 짝수라면 짝수의 개수를 +1
			// ---> 홀수개수 변수 따로 생성 짝수개수 변수 따로 생성하기(1번 아래)
			if (num % 2 == 0) {
				sum2++;
				// 짝수개수, 홀수개수 출력하기
				System.out.println("짝수개수 : " + sum2);
				System.out.println("홀수개수 : " + sum1);
			} else if (num % 2 == 1) {
				// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
				sum1++;
				// 짝수개수, 홀수개수 출력하기
				System.out.println("짝수개수 : " + sum2);
				System.out.println("홀수개수 : " + sum1);
			}
			// 7. 2~5까지 반복, -1을 입력하면 프로그램 종료
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

//		// 1. 입력받는 도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		int even = 0; // 짝수
//		int odd = 0; // 홀수
//		while (true) {
//			// 2. 정수 입력 출력하기(줄바꿈 없이)
//			System.out.print("정수입력 : ");
//			// 3. 정수 입력받기
//			int input = sc.nextInt();
//			// 4. 입력받은 정수가 짝수라면 짝수의 개수를 +1
//			// ---> 짝수의 개수와 홀수의 개수를 구할 변수가 하나씩 필요
//			if (input % 2 == 0) {
//				even++;
//			} else if (input % 2 == 1) {
//				// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
//				odd++;
//			}else if(input == -1) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			// 6. 짝수개수, 홀수개수 출력하기
//			System.out.println("짝수 개수 : " + even);
//			System.out.println("홀수 개수 : " + odd);
//			// 7. 2~6까지 반복, -1을 입력하면 프로그램 종료
//		}

	}

}
