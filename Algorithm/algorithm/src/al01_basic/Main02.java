package al01_basic;

public class Main02 {

	public Main02() {
		/*
		 * 1. 1~100까지의 난수를 50만들어 합을 구하라 2. 한줄에 6개의 난수를 출력하고 3. 마지막 줄에 합을 출력한다. 4.
		 * Random클래스 사용불가
		 * 
		 * 실행 15 65 19 54 95 24 69 25 31 69 42 26 2 8 25 62 95 32 : : : : 40 65 합=7484
		 * 
		 */
	}

	public static void main(String[] args) {
		int s = 0;
		// 난수
		for (int i = 1; i <= 50; i++) {
			int ran = (int) (Math.random() * 100) + 1; // 난수 생성
			System.out.printf("%3d ", ran); // 난수 출력
			s += ran; // 합
			if (i % 6 == 0) { // 줄바 꿈
				System.out.println();
			}
		}
		// 합출력
		System.out.println("\n합="+s);

	}

}
