/*
 * 작성일 : 2024년 04월 16일
 * 작성자 : 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다.
 *       사용자로부터 값을 입력받아 배열을 저장하고, 합과 평균을 출력하시오.
 * 
 * 문제분석 : 1차원 배열을 생성한 다음, 사용자로부터 값을 입력받아 배열에 저장시킨다.
 *         그 후에 배열에 입력받은 값들의 합을 구하고 그 합의 평균을 출력한다.
 *         
 * 알고리즘 : 1. 배열의 길이를 생성한다.
 *          1-1 배열의 초기값을 설정한다.
 *         2. 사용자로부터 값을 입력받아 배열에 저장시킨다.
 *          2-1 배열의 길이만큼 입력받도록 한다.
 *         3. 입력받은 값을 배열에 저장시킨다. 
 *         4. 배열에 저장되어있는 값들의 합을 구한다.
 *         5. 합을 구한후 그 값의 평균을 구한다.
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i , sum = 0;
		double avg;
	
		int num[] = new int[5]; // 배열 선언 및 생성
		
		System.out.println("배열의 길이 : " +num.length);
		
		System.out.println("배열에 저장된 초기값");
		for(i = 0; i < 5; i++) {
			System.out.println("num["+ i + "] =" + num[i]);
		}
		// System.out.println(num[0]);
		// System.out.println(num[1]);
		// System.out.println(num[2]);
		
		// 사용자로부터 값 입력 받아 배열에 저장.
		System.out.println("사용자로부터 값 입력 받아 배열에 저장");
		for(i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] 번지에 데이터 입력 : ");
			num[i] = stdIn.nextInt();
		}
		
		// 배열에 저장된 값 출력
		System.out.println("배열에 저장된 값");
		for(i = 0; i < 5; i++) {
			System.out.println("num["+ i + "] = " + num[i]);
		}
		// 배열에 저장된 값들의 합과 총점 계산하여 출력
		// sum = sum + num => num[0] + num[1] + num[2] ...
		
		for(i = 0; i <5; i++) {
			sum = sum + num[i];
		}
		avg = (double)sum / num.length; // sum / 5
		
		System.out.println("배열에 저장된 값들의 합 : " + sum);
		System.out.println("배열에 저장된 값들의 평균: " + avg);
	}
}
