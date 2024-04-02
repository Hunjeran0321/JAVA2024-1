/*
 * 작성일 : 2024년 03월 26일
 * 작성자 : 컴퓨터소프트웨어공학부 202195026 여동훈
 * 설명 : 조건식 연습.
 * 		숫자와 연산자를 입력 받아
 * 		사칙연산 프로그램을 작성하시오.
 * 		입력 방식 : 3 + 4 (띄어쓰기로 구분)
 * 		
 * [문제분석 및 알고리즘]
 * 		숫자 연산자 숫자를 입력 받아
 *      해당 연산자에 따른 결과를 출력한다.
 *		
 *		나눗셈의 결과는 ㅅ수자리가 나온다.
 *		소수 2자리까지 출력한다.
 *
 * 		나누기 할 때는 0으로 나눌 수 없다.
 *      두번째 수가 0이면
 *      "나눌 수 없습니다." 출력하자.
 * 
 * */

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		/*
		 * 사용자로부터 입력된 문자열에서 첫 번째 문자, 즉 연산자를 추출한다.
		 * stdIn.next()는 문자열을 입력받는 메서드이다.
		 * 입력된 문자열에서 첫번째 문자를 추출하기 위해서는 charAt(0)을 사용한다.
		 * 
		 */
		System.out.print("숫자와 연산자를 입력하세요.(예시 3 + 4) : "); // 1. 숫자와 연산자를 입력받는다.
		double num1 = stdIn.nextDouble(); // 첫번째 숫자 입력 
		char op = stdIn.next().charAt(0); // 연산자는 문자로 입력
		double num2 = stdIn.nextDouble(); // 두번째 숫자 입력
		
		//결과 값 게산
		double result = 0;
		
		switch(op) {
		case '+': // 덧셈 연
			result=num1+num2;
			break;
		case '-': // 뺄셈 연산
			result=num1-num2;
			break;
		case '*': // 곱셈 연산
			result=num1*num2;
			break;
		case '/':
			if (num2 !=0) { // 0으로 나눌 경우 에러 처리
				result = num1 / num2;
			} 
			else {
				System.out.println("0으로 나눌수 없습니다.");
				break;
			}
			result=num1/num2;
			break;
		default: //올바른 연산자가 아닌 경우 에러 처리 
			System.out.println("올바른 연산자를 입력하세요.");
			break;
		}
		
	System.out.println("결과 : " + result);
	}

}
