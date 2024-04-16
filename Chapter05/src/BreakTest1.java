/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 입력받은 수까지 합을 출력하시오.
 * 
 * 문제분석 ; 
 *         1부터(초기값)
 *         입력받은 값까지(조건식)
 *         1씩 증가(증감식)
 *         하면서 합계를 계산한다.
 *         sum = sum + num 공식
 *         sum = 0 초기값 지정이 반드시 필요하다. *
 *         
 * 알고리즘 : 0.sum = 0으로 초기값을 지정한다.
 *         1. 수는 1부터 (초기값)
 *         2. 수는 10까지 반복하면서 (조건식)
 *           2-1. 합계를 계산한다.
 *           2-2. 수를 1씩 증가한다. (증감식)
 *           2-3. 합계를 출력한다. 
 *         3. 합계를 출력한다. 
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 수를 입력하세요. : ");
		int num_input = stdIn.nextInt();
		int sum = 0 , num = 1;
		while (true) { // 무한 반복
			sum = sum + num;  // 합계 계산                 
			if(num_input == num) {   /* num_input < num */
			break;
			}
			num++; // 증감식
		}
		System.out.print(num_input + "까지의 합계는 :" + sum);
	}

}
