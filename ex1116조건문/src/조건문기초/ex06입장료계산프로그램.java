package 조건문기초;

import java.util.Scanner;

public class ex06입장료계산프로그램 {

	public static void main(String[] args) {
		// 1.에버랜드 환영 문구 출력
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		
		// 2. 나이를 입력하세요를 출력 후 나이 입력받기
		System.out.print("나이를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
	
		// 3. 인원수를 입력하세요를 출력 후 인원수 입력받기
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
				
		// 4. 20세 이상인 경우 입장료 5000원, 20세 이상이 아닐 경우 입장료를 50%할인
		if(age >= 20) {
			System.out.println("총" + (5000 * num) + "원입니다.");
		} else {
			System.out.println("총" + (2500 * num) + "원입니다.");
		}
		
		
		// 0. 입력도구 꺼내오기(한 번만 꺼내오면 계속 사용 가능)
		// Scanner sc = new Scanner(System.in);
		// 1. 출력
		// 원하는 코드 복사 단축기 : ctrl art 화살표 위 or 아래
		//System.out.println("====에버랜드에 오신 걸 환영합니다!!====");
		// 2. 나이 입력
		// System.out.print("나이를 입력하세요 : ");
		// int age = sc.nextInt();
		// 3. 인원수 입력
		// System.out.print("인원수를 입력하세요 : ");
		// int people = sc.nextInt();
		// 4. 나이가 20살 미만이라면 50%할인
		// int result = 0;
		// if(age < 20) {
			// result = (int) (5000 * 0.5 * people);
			// result : 지역변수(local variable)
			// ---> {} (지역, 영역)을 표시한다.
			// {} 안쪽에서 처음으로 만들어지는 변수는 {} 바깥쪽을 벗어날 수 없다.
		// }else {
			// 5. 그렇지 않은 경우에는 기본료 5000원 전부 받기
		//	result = 5000 * people;
		// }
		// 6. 총 금액을 출력하기
		// System.out.println("총" + result + "원입니다.");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
