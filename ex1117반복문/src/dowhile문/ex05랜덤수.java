package dowhile문;

import java.util.Random;

public class ex05랜덤수 {

	public static void main(String[] args) {
		
		// 자바에서 랜덤한 숫자(난수)를 생성하는 방법
		// 1. 랜덤한 숫자 생성하는 도구 꺼내오기
		Random rd = new Random();
		
		// 2. 랜덤한 숫자 생성하기 ---> 범위를 지정하고 싶다명 소괄호 안에 범위 넣어주기
		int ranNum = rd.nextInt(10)+1; // (10) = 0~9 ---> (10)+1 = 1~10
		System.out.println(ranNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
