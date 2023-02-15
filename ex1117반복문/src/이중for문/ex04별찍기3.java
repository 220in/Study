package 이중for문;

public class ex04별찍기3 {

	public static void main(String[] args) {

		// 예시
		// *****
		// ****
		// ***
		// **
		// *

		// 밖에 있는 for문 ---> 별 개수와 개행 용도
		for (int j = 5; j > 0; j--) {
			
			// 안에 있는 for문 ---> 별 출력 용도
			for (int i = 0; i < j; i++) { // i = 0대신 i < j+1로 대체 가능
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
	}

}
