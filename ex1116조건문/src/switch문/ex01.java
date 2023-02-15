package switch문;

public class ex01 {

	public static void main(String[] args) {
		int num = 5;
		switch(num) {  //--> if문처럼 중괄호로 나누어져 있지 않기 때문에 break로 멈춰주어야 함
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default :
			System.out.println("그 외의 숫자입니다.");
			break;
		}
		
		System.out.println("끝");
		
		
		
		
		
	}

}
