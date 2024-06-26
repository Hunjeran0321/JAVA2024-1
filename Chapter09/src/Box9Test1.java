/*
 * 작성일: 2024년 05월 14일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 클래스 : 접근 한정자
 */
class Box9{
	private int width; // private 
	private int height; // 외부에서 접근하여 수정되는 것을 방지.
	private int depth;
	private int vol;
	
	// 생성자
	public Box9(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		// 메소드 호출.
		volume(); // private 이어도 같은 클래스 내에서 생성자가 호출 가능.
	}
	
	// 메소드
	private void volume() { // private 으로 메소드 선언.
		// vol은 private로 선언된 객체변수이지만 내부에서는 사용 가능.
	 vol = width * height * depth;	
	}
	
	public int getvolume() {
		return vol;
	}
}
public class Box9Test1 {

	public static void main(String[] args) {
		Box9 mybox1 = new Box9(10,20,30);
		
		// private로 선언되어 변경 불가능.
		// mybox1.width = 20;
		
		// private로 선언된 메소드는 객체로 바로 접근 불가능.
		// int vol1 = mybox1.volume();
		
		System.out.println("정수 박스의 부피 : " + mybox1.getvolume());
	}

}
