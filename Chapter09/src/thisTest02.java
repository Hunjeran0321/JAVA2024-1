/*
 * 작성일: 2024년 05월 10일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 클래스 모음
 */
class Box2{
	int width; // 멤버 변수
	int height;
	int depth;
	
	// 생성자.
	// 매개변수의 의미가 명확해 졌다.
	// 객체변수와 매개변수의 이름이 같다. => 문제있다.
	public Box2(int width, int height, int depth) {
		// 자신의 변수에 자신의 값을 저장한다.
		// 생성자 메소드 내의 변수로만 취급된다. 
		width = width;
		height = height;
		depth = depth;
	}
}
public class thisTest02 {
	public static void main(String[] args) {
		Box2 mybox = new Box2(1,2,3);
		System.out.println(mybox.width);
		// 묵시적 값인 0이 출력된다. 
	}

}
