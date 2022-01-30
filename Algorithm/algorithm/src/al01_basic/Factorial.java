package al01_basic;

import java.util.Scanner;
/*
 ���� 
 5
 120
 */

public class Factorial {

	//for���� �̿��� ���丮�� ���ϱ�
	static int factorial1(int max) {
		// 5*4*3*2*1
		int result = 1;
		for(int i=max; i>=1; i--) { // 5,4,3,2,1
			result *= i;
		}
		return result;
		
	}
	
	
	// ��ȯ���� ���� ���ȣ��� ���丮�� ���ϱ�
	
	static int result = 1;
	public static void factorial2(int max) { // 5
		// ���ȣ���ߴ�
		if(max<=0) { return; }
		result *= max;
		factorial2(max-1); // 4
		
	}
	

	// ��ȯ���� �ִ� ���ȣ��� ���丮�� ���ϱ� 
	// ���丮�� ���� ����� �����ϴ� ���
	public static  int factorial3(int max) {
		if(max<=1) {return 1;}
		return max * factorial3(max-1);
	}
	
	// ���丮�� ���ϱ� (while��)
	public static int factorial4(int max) {
		int r = 1;
		while(true) {
			if(max<=1) {return r;}
			r*=max;
			max--;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// �Է��� ������ ���丮�� ���ϱ�
		int max = s.nextInt();
		
		// for���� �̿��� ���丮�� ���ϱ� 
		int res1 = factorial1(max);
		System.out.println("f1->"+res1);
		
		// ����ȣ��� ���丮�� ���ϱ� (��ȯ ������ X)
		// result = 1;
		factorial2(max);
		System.out.println("f2->"+result);
		
		int r = factorial3(max);
		System.out.println("f3->"+r);
		
		int r2 = factorial4(max);
		System.out.println("f4->"+r2);
	}

}
