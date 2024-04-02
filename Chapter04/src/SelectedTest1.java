/*
 * 작성일 : 2024년 03월 26일
 * 작성자 : 컴퓨터소프트웨어공학부 202195026 여동훈
 * 설명 : 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 *
 * [문제분석]
 *     짝수는 2로 나눈 나머지가 0이다.
 *     홀수는 2로 나눈 나머지가 1이다.(0이 아니다.)
 *     단. 세자리 숫자의 범위는 100 ~ 999이다.
 *     123을 입력햇을때 백의 자리는 홀수, 십의 자리는 짝수, 일의 자리는 홀수입니다.라고 출력하세요.
 *     
 *     100의 자리, 10의 자리, 1의 자리를 구분해야 한다.
 *     힌트 ) 나누기와 나머지 연산자를 활용한다.
 * [알고리즘]
 *     1. 숫자를 입력받는다.(세자리수)
 *     2. 세자리수가 맞는지 확인한다.
 *      2-1 잘못된 값이라고 출력한다.
 *     3 아니면
 *     	3-1 백의 자리 숫자가 홀수인지 짝수인지 판단한다.
 *      3-2 십의 자리 숫자가 홀수인지 짝수인지 판단한다.
 *      3-3 일의 자리 숫자가 홀수인지 짝수인지 판단한다.
 *     4. 확인된 값을 출력한다.
 *     
 * */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : "); // 1. 숫자를 입력받는다.
		int num = stdIn.nextInt();
		
		if (num>=100 && num <=999) { // 세자리수가 맞는지 확인한다.
		int num1 = num / 100;
		int num2 = (num % 100) / 10;
		int num3 = (num % 100) % 10;
		
		switch(num1) { // 3-1 백의 자리 숫자가 홀수인지 짝수인지 판단한다.
		case 0 : case 2 : case 4 : case 6 : case 8:
			System.out.println("백의 자리숫자는 짝수입니다."); 
			break;
		default:
			System.out.println("백의 자리숫자는 홀수입니다.");
		}
		switch(num2) { // 3-2 십이 자리 숫자가 홀수인지 짝수인지 판단한다.
		case 0 : case 2 : case 4 : case 6 : case 8:
			System.out.println("십의 자리숫자는 짝수입니다.");
			break;
		default:
			System.out.println("십의 자리숫자는 홀수입니다.");
		}
		switch(num3) { // 3-3 일의 자리 숫자가 홀수인지 짝수인지 판단한다.
		case 0 : case 2 : case 4 : case 6 : case 8:
			System.out.println("일의 자리숫자는 짝수입니다.");
			break;
		default:
			System.out.println("일의 자리숫자는 홀수입니다.");
			}
		}
		else {
			System.out.println("세자리수가 아닌 숫자를 입력하였습니다."); // 잘못된 값을 입력받았을 경우 출력
		}
		System.out.println("프로그램종료");
	}
}

