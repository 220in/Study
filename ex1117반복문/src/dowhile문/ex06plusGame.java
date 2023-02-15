package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class ex06plusGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 랜덤수 생성하는 도구 꺼내오기
		Random rd = new Random();

		// 2. 플러스 게임 시작 문구 출력하기
		System.out.println("===Plus Game===");

		// 3. 랜덤수 두 개 생성하기

		String yes = "";
		do {
			int ranNum1 = rd.nextInt(10);
			int ranNum2 = rd.nextInt(10);
			System.out.print(ranNum1 + "+" + ranNum2 + "=");

			// 4. 사용자에게 정답 입력받기
			int dab = ranNum1 + ranNum2;

			int o = sc.nextInt();

			if (o == dab) {
				System.out.println("성공!");
			} else {
				System.out.println("실패!");
				System.out.print("계속 하시겠습니까? >> ");

				yes = sc.next();

				
				// if(yes.equals("Y")) {

				if (yes.equals("N")) {
					System.out.println("종료합니다.");
				break;
				}

			}

		} while (yes.equals("Y"));

	

	}

}
