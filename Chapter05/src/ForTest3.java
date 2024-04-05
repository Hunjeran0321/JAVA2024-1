/*
 * 작성일 : 2024년 04월 05일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하시오.
 * 
 * 문제 분석 : 약수는 어떤 수를 나머지 없이 나눌 수 있는 자연수입니다.
 *          예를들어 9를 입력받았을때 나머지 없이 나누어 떨어지는 수는 1, 3, 9가 출력되어야 한다.
 *          단. 음의 정수나 0을 입력받았을때는 잘못된 값을 입력 받았다고 표시하여야 한다.
 * 
 * 알고릐즘 : 1. 정수를 입력받습니다.
 *          1-1. 0이나 음수를 입력받았을경우 다시 돌아갑니다.
 *         2. 1이상의 수를 입력받았을때(초기값)
 *         3. 입력받은 값부터 1까지 나머지가 나오지않을때 까지 계산하며(증감식)
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하시오. : ");
		int num = stdIn.nextInt();
		if (num <= 0) { // 정수가 아닌 값을 입력 받았을때 
            System.out.println("음수와 0은 약수를 계산할수 없습니다.");
            return;
        }
		
		System.out.println(num + "의 약수는: ");
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
            System.out.println(i+" ");
			}
		}
		System.out.println("입니다.");
	}
}
