package 이중for문;

import java.util.Scanner;

public class ex01약수구하기 {

	public static void main(String[] args) {

		// 1부터 1000까지 모든 숫자들의 약수를 구해보자

	    //        1.       2.      3.
		for (int j = 1; j < 1001; j++) {
			// 밖에 있는 for문 ---> 1~1000까지 가져오는 for문
			//    4.
			int num = j;
            System.out.print(num + "의 약수 : ");
            
            //        5.       6.      7.
			for (int i = 1; i <= num; i++) {
				// 안에 있는 for문 ---> 약수를 구하는 for문
				//       8.
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
			//       9.
			System.out.println();
		}

		// 1 -> 2 -> 4 -> 5 -> 6 -> 8 -> 7 -> 6 -> 9 -> 3 
		// ->   2 -> 4 -> 5 -> 6 -> 8 -> 7 -> 6 -> 8 -> 7 -> 6 (8 -> 7 -> 6을 6이 거짓일 때까지 반복) -> 9 -> 3
		// ---> 2가 거짓일 때까지 반복
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
