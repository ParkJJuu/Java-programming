public class Checktime137_3 {

	public static void main(String[] args) {
		
		int tenArray[] = new int[10];
		int sum = 0;
		
		for (int i = 1; i < tenArray.length; i++) {
			tenArray[i] = i;
			sum += tenArray[i];
		}
		// 1~9값이 각 배열에 저장
		System.out.println("원소 값의 합은 " + sum + "입니다.");		// 45
	}
}