/*
 * 작성일: 2024년 04월 30일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : MultiDiv 클래스 생성
 *      곱하기, 나누기 계산하기 기능이 있다.
 *      그리고 더하기, 빼기 계산하는 기능도 있다.
 */
			// PlusMinus 로부터 상속
public class MultiDiv extends PlusMinus{
	// 속성 정의
	int multi;
	double div;
	
	// multi 기능(메소드) 정의
	public String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	
	// div 기능(메소드) 정의
	private String div(int x, int y) {
		div =  x / y;
		return "두 수의 나눈 값은 " + div;
	}
}
