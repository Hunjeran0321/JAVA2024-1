/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 10까지 합을 출력하시오.
 */
import java.util.Scanner;

public class doWhileTest2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int month = 0;
		
		do {
			System.out.print("월을 입력하세요 : ");
			month = stdIn.nextInt();
			switch(month)
			{
				case 0:
					System.out.println("프로그램 종료");
					break;
				case 3 : case 4 : case 5 :
					System.out.println("봄입니다.");
					break;
				case 6 : case 7 : case 8 :
					System.out.println("여름입니다.");
					break;
				case 9 : case 10 : case 11 :
					System.out.println("가을입니다.");
					break;
				case 1 : case 2 : case 12 :
					System.out.println("겨울입니다.");
					break;
				default:
					System.out.println("1~12월을 벗어난 달입니다.");
					break;
			}
		} while (month !=0);
	}

}
