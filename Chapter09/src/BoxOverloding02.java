/*
 * 작성일: 2024년 05월 10일
 * 작성자: 202195026 컴퓨터소프트웨어공학부 여동훈
 * 설명 : 클래스 모음
 */
class Box6 {
	// 멤버변수 - 객체변수. 클래스 전역에서 사용 가능.
	int width;
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	// 생성자 오버로딩. - 정수형 매개변수 3개
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// 생성자 오버로딩. - 실수형 매개변수 3개
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}
public class BoxOverloding02 {
	public static void main(String args[]) {
		// 정수형 매개변수가 3개인 생성자 호출.
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 실수형 매개변수가 3개인 생성자 호출.
		mybox1 = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 정수형, 실수형 매개변수가 3개인 생성자 호출. => 없다.
		// 혼합되어 있는 경우 자동으로 확대형으로 변환되어 수행.
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(정수와 실수 혼합) : " + dvol);
	}
}
