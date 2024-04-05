/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 10까지 합을 출력하시오.
 * 
 * 문제분석 : 단은 고정이다 ( 입력 받는다 )
 *         곱하는 수는 1부터 9까지 1씩 증가한다.
 *         곱셈의 결과는 단 * 수이다. 
 *         구구단 곱셈의 과정이 하나씩 출력되어야 한다. 
 *         
 * 알고리즘 : 1. 단을 입력받는다. (단은 정수입니다.)
 *         2. 곱하는 수는 1부터 9까지 반복하면서 (초기값, 조건식, 증감식)
 *           3. 구구단을 출력한다.
 */

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요. : ");
		int dan = stdIn.nextInt();

		for(int su = 1; su < 10; su++) {
			System.out.println(dan + "X" + su + "=" + dan*su);
		}
	}

}

