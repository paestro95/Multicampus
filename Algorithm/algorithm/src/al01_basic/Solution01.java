package al01_basic;

import java.util.Scanner;

public class Solution01 {

	public Solution01() {
		/*
		 * 실행 
		 * 입력 데이터 : 5 
		 * 5*2 = 10, 
		 * 5*3 = 15 
		 * :
		 * : 
		 * 5*9 = 45;
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for(int i=2; i<=9; i++) {
			int r = dan*i;
			System.out.printf("%2d * %2d = %3d\n",dan,i,r);
		}
	}

}
