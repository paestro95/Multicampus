package al01_basic;

public class Main02 {

	public Main02() {
		/*
		 * 1. 1~100������ ������ 50����� ���� ���϶� 2. ���ٿ� 6���� ������ ����ϰ� 3. ������ �ٿ� ���� ����Ѵ�. 4.
		 * RandomŬ���� ���Ұ�
		 * 
		 * ���� 15 65 19 54 95 24 69 25 31 69 42 26 2 8 25 62 95 32 : : : : 40 65 ��=7484
		 * 
		 */
	}

	public static void main(String[] args) {
		int s = 0;
		// ����
		for (int i = 1; i <= 50; i++) {
			int ran = (int) (Math.random() * 100) + 1; // ���� ����
			System.out.printf("%3d ", ran); // ���� ���
			s += ran; // ��
			if (i % 6 == 0) { // �ٹ� ��
				System.out.println();
			}
		}
		// �����
		System.out.println("\n��="+s);

	}

}
