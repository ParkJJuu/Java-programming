/*
 * �ۼ���¥ : 2023.10.02
 * �ۼ��� : ���ֿ�
 * �ۼ����� : ��ǰ �ڹ� ���α׷��� 167p �ǽ����� - main() �Ű����� ó���� Integer.parseInt()
 * 
 * ���� : ������ ���� �۵��ϴ� Average.java�� �ۼ��϶�. ����� ���ڴ� ��� ������ ���Ǹ� �������� �����
 * ����Ѵ�. ���� ȭ���� �����ϵ� Average.class ������ c:\Temp ���͸��� ������ �� ������ ����̴�. ����
 * Average.class ������ ��Ŭ������ ������Ʈ ���� �ؿ� bin ������ �ִ�.
 */
public class Average {
	public static void main(String[] args) {
		int sum = 0;	// �������� ����� ������ ���� ���� �� �ʱ�ȭ
		
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.println(sum / args.length);
	}
}