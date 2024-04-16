/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 입력받은 수 까지의 짝수들끼리의 합을 구하기
 * 
 * 문제분석 : 1부터 입력받은 수의 짝수끼리의 합을 구하기.
 *  예를들어 10을 입력 받을경우 2, 4, 8, 10의 합인 30이 나오게 한다.
 *         
 * 알고리즘 : 1. 정수를 입력받는다. 
 *         2. 입력 받은 정수에서 짝수를 도출한다.
 *         3. 합계를 구하는 과정에서 홀수가 아닌 짝수의 숫자끼리만 더한다.
 *         4. 더한 값을 출력한다. 
 */
import java.util.Scanner;

public class ContinueTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 정수를 입력하세요. : ");

		int num = stdIn.nextInt();
		
		int i, sum = 0;
		for (i = 1 ; i <= num ; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum = sum + i;
		}
		System.out.print("1부터" + num + "까지 합 =" + sum);
	}

}
