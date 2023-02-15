package for문;

import java.util.Scanner;

public class ex04구구단발전 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("단을 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("어느 수까지 출력할 것입니까? : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i <= num2; i++) {
			System.out.println(num + "*" + i + "=" + num2 * i );
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
