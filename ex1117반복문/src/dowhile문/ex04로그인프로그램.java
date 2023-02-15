package dowhile문;

import java.util.Scanner;

public class ex04로그인프로그램 {

	public static void main(String[] args) {

		// 정답 아이디, 비밀번호
		String answerId = "test";
		String answerPw = "test1234";

		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {// 1. 아이디 입력
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();

			// 2. 비밀번호 입력
			System.out.print("비밀번호를 입력하세요 : ");
			String pw = sc.next();

			// 3. 아이디와 비밀번호가 전부 일치하는 지 여부 비교
			if (id.equals(answerId) && pw.equals(answerPw)) { // ---> String의 비교 연산자는 .equals(비교 대상)이다.
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("로그인 실패");
				// num++; 
			}
			
			++num;
			
			if (num == 3) {
				System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
				break;
			}
			
		} while (true);

	}

}
