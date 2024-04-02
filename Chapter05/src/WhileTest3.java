/*
 * 작성일 : 2024년 04월 02일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 정수를 입력받아 정수의 팩토리얼 값을 출력하시오.
 * 
 * 문제분석 : 5! = 5*4*3*2*1* => 120
 *         
 * 알고리즘 : 1. 정수를 입력받는다.
 *         2. 입력받은 정수에서(초기값)
 *         3. 1까지 반복하면서(조건식) 
 *           3-1. 팩토리얼을 출력한다.
 *           3-2. 1까지 1씩 내려가며 곱한다. (감소식)
 *         4. 결과를 출력한다.
 */

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in);
		// 1. 정수를 입력 받는다.
		System.out.print("원하는 숫자를 입력하시오. : ");
		int fac = stdIn.nextInt();
		
		if (fac < 1) { // 정수가 아닌 값을 입력 받았을때 
            System.out.println("음수와 0은 팩토리얼을 계산할 수 없습니다.");
            return;
        }
		// 2. 입력받은 정수에서
		int factorial = fac; // 팩토리얼을 계산할때 사용하는 초기값을 설정
		while (fac > 1) { //정수값이 입력되었을때
			System.out.print(fac+"*");
			factorial *= --fac; // factorial 변수는 팩토리얼 연산 중간 결과를 저장
		}
		System.out.print("1="+factorial);
	}

}
