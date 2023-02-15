package 조건문복합예제;

import java.util.Scanner;

public class ex02자판기프로그램답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 금액을 입력받기
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		// 2. 메뉴를 출력하기
		System.out.println("메뉴를 고르세요.");
	    System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >> ");
	    
	    // 3. 메뉴를 입력받기
	    int menu = sc.nextInt();
	    
	    // 4. 메뉴에 따라서 잔돈을 계산하기
	    int change = money;
	    if(menu == 1) {
	    	// 5. 입력한 금액이 선택한 메뉴보다 더 큰지 판단하기
	    	if(money >= 700) {
	    		change = money - 700;
	    	}else {
	    		System.out.println("돈이 부족합니다.");
	    		// change = money; ---> change에 0이 아닌 money의 값을 넣어줌으로써 생략 가능.
	    	}
	    }else if(menu == 2) {
	    	if(money >= 1000) {
	    	change = money - 1000;
	    	}else{
	    		System.out.println("돈이 부족합니다.");
	    		// change = money;
	    	}
	    	
	    }else if(menu == 3) {
	    	if(money >= 500) {
	    		change = money - 500;	
	    	}else {
	    		System.out.println("돈이 부족합니다.");
	    		// change = money;
	    	}
	    }else {
	    	System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
	    	// change = money;
	    }
	    
	    // 6. 잔돈 출력하기
		System.out.println("잔돈 : " + change + "원");
		
		
	}

}
