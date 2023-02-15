package for문;

public class ex05for문예제bonus {

	public static void main(String[] args) {

		int num7 = 0;
		int num6 = 0;
		int result = 0;

		for (int num = 1; num < 101; num++) {
			if (num % 2 == 1) {
				System.out.print(num + "-");
				num6 += num;
			} else {
				System.out.print(num + "+");
				num7 -= num;
			}

		}
		result = num6 + num7;

		System.out.println();
		System.out.print("결과 : " + result); // --- 결과값은 한 번 출력하기 때문에 for문에서 나와서 출력해주어야 한다

	}

}
