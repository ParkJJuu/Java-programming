public class Checktime_145_3 {

	static char[] makeCharArray() {	// 리턴 타입 작성
		char [] c = new char[4];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = (char)('a' + i);
		}
		return c;	// return문 작성
	}
	
	public static void main(String[] args) {
		char [] b = new char[4];
		b = makeCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
