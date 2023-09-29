public class Checktime127_3_dowhile {

	public static void main(String[] args) {
		int i = 5;
		do {
			int j = 0;
			while(j++ < i)
				System.out.print('*');
			System.out.println();
			i--;
		} while (i>0);
	}
}