/*
 * 작성일: 2024년 05월 10일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 클래스 모음
 */
class Box1{
	int width; // 멤버 변수
	int height;
	int depth;
	
	// 생성자.
	// 매개변수로 지정된 w,h,d는 의미를 알기 어렵다.
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class thisTest01 {
	public static void main(String[] args) {
		Box1 mybox = new Box1(1,2,3);
		System.out.println(mybox.width);
	}

}
