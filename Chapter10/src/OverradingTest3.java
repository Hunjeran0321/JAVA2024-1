/*
 * 작성일: 2024년 05월 24일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 메소드 오버라이딩
 */
class OT3a {
	// 매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show() 수행 : " + str);
	}
}
class OT3b extends OT3a {
	@Override
	public void show(String str) {
		System.out.println("하위 클래스 메소드 show() 수행 : " + str);
		// super.show(str); // 상위 클래스의 메소드로 접근 할 때 사용.
	}
	
}
public class OverradingTest3 {

	public static void main(String[] args) {
		OT3b otb = new OT3b();
		otb.show("오늘은 금요일입니다.");
	}

}
