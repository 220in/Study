package 이중for문;

import java.util.Scanner;

public class ex05별찍기3변형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 줄 짜리 직각삼각형을 만들 것입니까? : ");
		int num = sc.nextInt();

		// 밖에 for문 ---> 행(줄)의 개수
		for (int j = 0; j < num; j++) {
			
			// 안에 for문 ---> 한 줄에 찍히는 별의 개수
			for (int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
