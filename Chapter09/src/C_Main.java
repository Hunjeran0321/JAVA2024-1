/*
 * 작성일: 2024년 05월 14일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : main() 메소드
 */

public class C_Main {
	int count = 10; // 객체 변수
	static int num = 20; // 클래스 변수
	
	// 메소드 선언
	public int sum(int x, int y) {
		return x + y;
	}
	
	// 클래스 메소드 선언.
	static int mul(int x, int y) {
		return x * y;
	}
	
	// 메인 메소드 = 클래스 메소드.
	public static void main(String[] args) {
		int same; // 메인 메소드에서 선언한 지역 변수.
		
		// 반드시 클래스 변수, 지역 변수만 사용 가능하다.
		// same = count; // count는 객체 변수여서 오류가 발생한다.
		
		same = num; // 클래스 변수이기에 사용가능하다.
		System.out.println("num = " + same);
		
		// 클래스 메소드가 아니오서 오류 발생한다.
		// 호출 불가능.
		// same = sum(5, 5);
		
		same = mul(5, 5);
		System.out.println("mul = " + same);
	}

}
