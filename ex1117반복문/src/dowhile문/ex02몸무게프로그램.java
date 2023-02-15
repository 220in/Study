package dowhile문;

import java.util.Scanner;

public class ex02몸무게프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int kg = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goalkg = sc.nextInt();

		int plus = 0;
		int num = 1;

		do {
			System.out.print(num + "주차 감량 몸무게 : ");
			int downkg = sc.nextInt();
			plus = plus + downkg;
			num++;

		}while ((kg - plus) > goalkg); //---> 언제 반복시킬 건지 결정해 주는 식이다. (언제 끝내는 지가 아니라)
                                       // 즉, kg - plus >= goalkg 에서 kg-plus의 값고 goalkg의 값이 같을 땐 조건이 성립하므로		 
		                               // 한 번 더 반복시킨다.

		System.out.println((kg - plus) + "kg달성! 축하합니다!");

		// 감량 몸무게를 입력받을 변수 설정



	}

}
