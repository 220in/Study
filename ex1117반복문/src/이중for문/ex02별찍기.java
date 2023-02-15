package 이중for문;

public class ex02별찍기 {

	public static void main(String[] args) {

		// 반복시킬 영역 전체를 중괄호로 묶어주기
		
		// 예시: *****
		
		//       1.       2.    3.
		for (int i = 0; i < 5; i++) {
			// 밖에 있는 for문 ---> 5줄을 출력해주는 for문(개행용)
		
		    //      4.       5.    6.
			
			for(int j = 0; j < 5; j++) {
				// 안에 있는 for문 ---> 별을 다섯개 찍어주는 for문
				//      7.
				System.out.print("*");
			}
			//      8.
			System.out.println();
		}

		// 1 -> 2 -> 4 -> 5 -> 7 -> 6 -> 5 -> 7 -> 6 
		// -> 8 -> 3 -> 2 -> 4 -> 5 -> 7 -> 6 ---> (5 -> 7 -> 6에서 5가 거짓일 때까지 반복)
		
		
		
		
		
		
		
		
		
		
	}

}
