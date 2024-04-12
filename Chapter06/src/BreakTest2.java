/*
 * 작성일 : 2024년 04월 12일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 
 * 
 * 문제분석 : 
 * 알고리즘 : 
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