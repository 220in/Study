package 이중for문;

public class ex06별찍기4 {

	public static void main(String[] args) {

		// 예시
		//     * ---> space 4번, 별 1번
		//    ** ---> space 3번, 별 2번
		//   ***
		//  ****
		// *****

		for (int j = 1; j < 6; j++) {
			for (int u = 5; u > j; u--) { // ---> (int i = 0; i < 5-j; i++)
				System.out.print(" ");    
			} //=> 검사 조건의 값 = 4-3-2-1-0
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			} //=> 검사 조건의 값 = 1-2-3-4-5
			System.out.println();
		}

		
//		System.out.print("   ");
//		for (int i = 0; i < 2; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for(int i = 0; i < 2; i++){
//		System.out.print(" ");
//      }
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//      for(int i = 0; i < 1; i++){
//		System.out.print(" ");
//    	}
//		for (int i = 0; i < 4; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}

//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.println();

//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

	}

}
