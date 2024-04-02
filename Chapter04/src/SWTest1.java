
public class SWTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		int hap = 0;
		switch(count++) {
		case 3 : hap = hap +count;
		case 4 : hap = hap +count;
		case 5 : hap = hap +count;
		}
		System.out.print(hap);
	}

}
