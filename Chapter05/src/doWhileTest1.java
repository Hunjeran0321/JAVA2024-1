/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1부터 10까지 합을 출력하시오.
 */
public class doWhileTest1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1; // 초기값
		
		do {
			sum = sum + num;
			num ++;
		} while(num <= 10); // 조건식
		System.out.println("1부터 10까지의 합 : " + sum + "입니다");
	}

}
