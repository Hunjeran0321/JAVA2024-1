/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 정수를 입력하시오 : 5
 * ★
 * ★★
 * ★★★
 * ★★★★
 * ★★★★★
 * 
 * 문제분석 : 입력받은 정수에 따라 별을 1부터 입력받은 숫자만큼의 줄까지 별을 출력하시오.
 *         단, 0과 음수를 입력받았을경우에는 다시 입력하게 하여야 한다.
 * 알고리즘 : 1. 정수를 입력받는다. 
 *         2. 정수에 개수에 따라 별을 표시한다.
 */

import java.util.Scanner;

public class nestedLoopTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하시오. : ");
		int num = stdIn.nextInt();

		int i =1;
		while(i <= num) {
			int star = 1;
			while (star <= i) {
				System.out.print("★");	
				star++;
			}
			System.out.println("");
			i++;
		}
		if (num <= 0) { // 정수가 아닌 값을 입력 받았을때 
            System.out.println("음수와 0은 표시할수 없습니다.");
            return;
        }
		System.out.println("프로그램 종료");
	}

}
