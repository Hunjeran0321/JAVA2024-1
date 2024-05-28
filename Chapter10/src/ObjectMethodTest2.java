/*
 * 작성일: 2024년 05월 24일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : object 클래스의 tostring() 메소드
 * 객체의 문자열 표현을 반환하는 중요한 메소드이다.
 * 객체를 문자열로 표현 할때 사용하는 것이다.
 */
class AAA1 {
	public int a = 10;

	@Override
	public String toString() {
		return "AAA1클래스 객체 속성 a의 값은 : " + a;
	}
	
}
public class ObjectMethodTest2 {
	public static void main(String[] args) {
		AAA1 aa = new AAA1();
		System.out.println(aa.toString());
		System.out.println(aa);
	}

}
