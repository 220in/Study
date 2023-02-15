package 조건문복합예제;

import java.util.Scanner;

public class ex03자판기프로그램설명 {

	public static void main(String[] args) {
		
		// 0. 사용자에게 입력하는 도구 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 1. 금액 입력을 출력하기
		System.out.print("금액 입력 : ");
		
		// 2. 사용자에게 금액 입력받기
		int money = sc.nextInt();
		
		// 3. 메뉴를 고르세요라는 문구와 메뉴출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >> ");
		
		// 4. 사용자가 선택한 메뉴 입력받기
		int menu = sc.nextInt();
		
		// 5. 메뉴에 따라 잔돈 계산하기
		// 5-1) 잔돈이라는 변수를 설정하기
		int change = money; // <--- int change = 0; (잔돈 반환을 할 때에 money의 값을 계산하여 반환하기 떄문에 
		                                         // change는 money값으로 쓸 수 있다.)
		// 5-2) 1번 메뉴를 고르기 
		if(menu == 1) { 
			// 5-3) 메뉴가 입력한 금액보다 비싸지 않은지 판별하기 (중첩 if문 사용)
			if(money >= 700) {
				// 5-4) 비싸지 않다면 입력한 금액에서 메뉴를 계산한 돈을 출력
				change = money - 700;
			}else {
				// 5-5) 비싸다면 입력한 금액을 그대로 출력
				System.out.println("잔돈이 부족합니다.");
				// change = money; ---> change를 0이 아닌 money로 변수값을 바꿔주었기 때문에 생략 가능
			}
		
		}else if(menu == 2) {
			if(money >= 1000) {
				change = money - 1000;
			}else {
				System.out.println("잔돈이 부족합니다.");
				// change = money;
			}
		
		}else if(menu == 3) {
			if(money >= 500) {
				change = money - 500;
			}else {
				System.out.println("잔돈이 부족합니다.");
				// change = money;
			}
		}else {
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
			// change = money;
		}
		// 6. 잔돈의 값 출력
		System.out.println("잔돈 : " + change + "원");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
