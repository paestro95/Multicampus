package al01_basic;

import java.util.Scanner;

public class Solution2 {
	

	/*
	 * 실행 입력 데이터 : 3 3*2 = 10, 3*3 = 15 : : 3*9 = 45;
	 */
	public static void gugudan(int dan) {
		for (int i=2; i<=9; i++) {
			int r = dan * i;
			System.out.printf("%2d * %2d = %3d\n",dan,i,r);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		gugudan(dan);

	}

}
