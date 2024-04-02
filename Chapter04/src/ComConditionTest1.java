/*
 * 작성일 : 2024년 03월 22일
 * 작성자 : 컴퓨터소프트웨어공학부 202195026 여동훈
 * 설명 : 조건식 연습.
 * 		월을 입력받아 해당 계절을 출력하시오.
 * 		3,4,5월 => 봄
 * 		6,7,8월 => 여름
 * 		9,10,11월 => 가을
 *      12,1,2월 => 겨울
 * 		
 * 문제분석 : 입력 받아야 할 값은
 * 			1,2,3,4,5,6,7,8,9,10,11,12이다.
 * 			0이나 13을 입력하면 => 해당 월은 없습니다 출력하자.
 * 			다중 if?
 * 			내포된 if?
 * 알고리즘 : 1. 정수(월)을 입력받는다
 *         2. if 점수의 범위가 1~12(월) 사이인가?37
 *         3. 1~12(월)이 아닌 값을 입력받았을때 어떻게 나타내는가?
 */

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력 : "); // 1. 정수(월)을 입력받는다.
		int month = stdIn.nextInt();
		if (month >= 1 && month <= 12) { // 2. if 점수의 범위가 1~12(월) 사이인가?
		
			if (month >= 3 && month <= 5) {
				System.out.print("봄입니다. "); // 3~5월은 봄입니다.
			}
			if (month >= 6 && month <= 8) {
				System.out.print("여름입니다. "); // 6~8월은 여름입니다.
			}
			if (month >= 9 && month <= 11) {
				System.out.print("가을입니다. "); // 9~11월은 가을입니다.
			}
			if (month == 1 || month == 2 || month == 12) { // 12,1,2월은 겨울입니다.
				System.out.print("겨울입니다. ");
			}
		}
		else {
			System.out.println("해당 월은 없습니다."); // 3. 1~12(월)이 아닌 값을 입력받았을때 어떻게 나타내는가?
		}
		System.out.println("프로그램 종료");
	}	
}

