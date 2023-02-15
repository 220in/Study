package 조건문복합예제;

import java.util.Scanner;

public class ex04자판기프로그램번외 {

	public static void main(String[] args) {
		
		// 0. 사용자에게 입력하는 도구 Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 1. 금액 입력을 출력하기
		System.out.print("금액 입력 : ");
		
		// 2. 사용자에게 금액 입력받기
		int money = sc.nextInt();
		
		// 3. 메뉴를 고르세요라는 문구와 메뉴출력하기
		System.out.println("메뉴를 고르세요.");
		
		// 3-1) 메뉴 값을 변수로 설정하여 출력하기
		int menu1 = 700;
		int menu2 = 1000;
		int menu3 = 500;
		
		System.out.print("1. 아우터(" + menu1 + "원)");
		System.out.print("2. 이구동성(" + menu2 + "원)");
		System.out.print("3. 에그몽(" + menu3 + "원)>> ");
		
		// 4. 사용자가 선택한 메뉴 입력받기
		int menu = sc.nextInt();
		
		// 5. 메뉴에 따라 잔돈 계산하기
		// 5-1) 잔돈이라는 변수를 설정하기
		int change = money; 
		
		// 5-2) 1번 메뉴를 고르기 
		if(menu == 1) { 
			// 5-3) 메뉴가 입력한 금액보다 비싸지 않은지 판별하기 (중첩 if문 사용)
			if(money >= menu1) {
				// 5-4) 비싸지 않다면 입력한 금액에서 메뉴를 계산한 돈을 출력
				change = money - menu1;
			}else {
				// 5-5) 비싸다면 입력한 금액을 그대로 출력
				System.out.println("잔돈이 부족합니다.");
				
			}
		
		}else if(menu == 2) {
			if(money >= menu2) {
				change = money - menu2;
			}else {
				System.out.println("잔돈이 부족합니다.");
				
			}
		
		}else if(menu == 3) {
			if(money >= menu3) {
				change = money - menu3;
			}else {
				System.out.println("잔돈이 부족합니다.");
			
			}
		}else {
			System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
			
		}
		// 6. 잔돈의 값 출력
		System.out.println("잔돈 : " + change + "원");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
