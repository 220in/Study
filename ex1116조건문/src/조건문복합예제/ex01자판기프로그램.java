package 조건문복합예제;

import java.util.Scanner;

public class ex01자판기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 금액을 입력하세요를 출력
		System.out.print("금액을 입력하세요 : ");
		
		// 2. 금액 입력받기 
		int won = sc.nextInt();
		
		// 3. 메뉴 종류 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700) 2.이구동성(1000) 3.에그몽(500) >> ");
		
		// 4. 사용자가 선택할 메뉴 입력받기
		int menu = sc.nextInt();
		
		// 5. 잔돈 출력하기
		
		if(won < 500) {
			System.out.println("잔돈이 부족해요");
			System.out.println("잔돈 : " + won + "원");
		}else if(menu == 3) {
			System.out.println("잔돈 : " + (won - 500));
		}else if(won < 700) {
		    System.out.println("잔돈이 부족해요");
		    System.out.println("잔돈 : " + won + "원");
	    }else if(menu == 1) {
			System.out.println("잔돈 : " + (won - 700) + "원");
			
		}else if(won < 1000) {
			System.out.println("잔돈이 부족해요");
			System.out.println("잔돈 : " + won + "원");
		}else if(menu == 2) {
			System.out.println("잔돈 : " + (won - 1000));
	}
	
		
	}

}
