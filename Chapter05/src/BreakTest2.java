/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : ♥를 매 줄마다 출력하는데 조건을 활용하여 출력하게끔 한다.
 * 
 * 문제분석 : i 와 j의 값이 나와있는 상태에서 조건식을 이용하여 하트를 매줄마다 표현한다.
 * 알고리즘 : 1. i와 j를 값을 설정한다.
 *         2. j > 6보다 크다는 조건을 걸어 break; 를 걸어준다. 
 *         3. i = 10까지 결과값이 나오도록 한다. 
 */
public class BreakTest2 {

	public static void main(String[] args) {
		
		int i,j;
		for(i = 1; i < 10 ; i++) {
			for (j = 1; j < i; j++) {
				if (j > 6) {
					break;
				}
				System.out.print("♥ ");
			}
			System.out.println();
		}
	}
}