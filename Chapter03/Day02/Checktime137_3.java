public class Checktime137_3 {

	public static void main(String[] args) {
		
		int tenArray[] = new int[10];
		int sum = 0;
		
		for (int i = 1; i < tenArray.length; i++) {
			tenArray[i] = i;
			sum += tenArray[i];
		}
		// 1~9���� �� �迭�� ����
		System.out.println("���� ���� ���� " + sum + "�Դϴ�.");		// 45
	}
}