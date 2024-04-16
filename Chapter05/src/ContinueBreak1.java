/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하시오.
 *      음수가 입력 되면 점수 입력이 종료됩니다.
 *      100점 초과의 점수는 계산에 포함되지 않습니다.
 * 
 * 문제분석 : 계속해서 점수를 입력 받습니다. = > 무한반복
 * 		   세상에 100과 음수인 점수는 없기에 100 이상인 수를 입력받으면 다시 입력 받습니다.
 *         음수를 입력받았을땐 프로그램을 종료하면서 합계와 평균을 구합니다.
 *        
 * 알고리즘 : 1. 합계와 평균의 초기값을 설정한다. 
 *         2. 받은 점수를 입력 받는다.
 *          2-1 받은 점수입력이 100보다 클 경우 다시 재입력이 뜨게 해야한다.
 *         3. 받은 점수가 0보다 작을경우 점수 입력을 종료한다.
 *         4. 지금까지 받았던 점수들의 합계와 평균을 구한다.
 *         5. 프로그램을 종료한다.
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int count = 0 ;
		
		while(true) {
			System.out.print("받은 점수를 입력하세요 : ");
			int score = stdIn.nextInt();
			if (score < 0) {
			System.out.print("점수 입력이 종료됩니다. ");
			break;	
			}
			if (score > 100) {
				System.out.print("점수는 100점까지 입력가능합니다. ");
				continue;
			}
			sum += score;
	        count++;
		}
		System.out.println("점수의 합계는 " +sum +"평균은 "+ (sum/count) +"입니다.");
	}

}
