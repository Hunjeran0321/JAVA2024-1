/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 입력받은 수 까지의 짝수들끼리의 합을 구하기
 * 
 * 문제분석 : 
 *         
 * 알고리즘 : 
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
