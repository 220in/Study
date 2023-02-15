package for문;

import java.util.Scanner;

public class ex05약수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int num2 = 1; num2 <= num1; num2++) {
			if (num1 % num2 == 0) {
				System.out.print(num2 + " ");
			}

		}

	}

}
