package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class ex07plusGameWhile문활용 {

	public static void main(String[] args) {

		// 0. 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		while (true) {// 1. 1~10까지의 랜덤한 숫자 2개 생성하기
			int ranNum1 = rd.nextInt(10) + 1;
			int ranNum2 = rd.nextInt(10) + 1;

			// 2. 생성한 두 개의 숫자로 문제 출력하기
			// ex) 6 + 7 =
			System.out.print(ranNum1 + "+" + ranNum2 + "=");

			// 3. 사용자로부터 정답 입력받기
			int input = sc.nextInt();

			// 4. 입력 받은 값과 두 수의 값이 일치한다면 성공 출력
			if (input == ranNum1 + ranNum2) {
				System.out.println("Success!");

			} else {
				// 5. 일치하지 않다면
				// 5-1. 실패 출력
				System.out.println("Fail!");

				// 5-2. 계속할건지 물어본 후 사용자로부터 값 입력
				System.out.print("계속하시겠습니까? >> ");
				String con = sc.next();

				// 5-3. 사용자가 Y를 입력하면 계속 실행
				if (con.equals("Y")) {
					continue; // 더 이상 반복문 아래쪽의 코드를 보지말고, 다시 반복문의 시작지점으로 돌아감
				} else {
					// 5-4. N을 입력하면 프로그램 종료
					System.out.println("종료되었습니다.");
					break;
				}
				

			}

		} // 6. 1~5까지 반복하기
	}

}
