package algorismProject1;

import java.util.Arrays;
import java.util.Scanner;

/*
�� ���� �˰����� ����Ͽ� ���� 
�Է��� �л� �� ��ŭ ������ �Է��ϰ� ���������� �����Ͽ� ���
*/

public class quickSort {
		public static void swap(int a[], int idx1, int idx2) {
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
		}
		
		
		// ��������, ��������
		// Quick ���� �޼ҵ�
		public static void myQuickDesc(int a[], int left, int right) {
			int pl = left; // ���ʺ��� �˻��� index ��ġ
			int pr = right; // �����ʺ��� �˻��� index ��ġ
			int pivot = a[(left+right)/2]; // �ǹ���ġ�� ���� ���Ѵ�.
			
			do {
				// �ǹ����� ���ʿ��� ���������� �ǹ��� ������ ū �����Ͱ� �ִ� index ã��
				while(a[pl] > pivot) {pl++;}
				// �ǹ����� �����ʿ��� �������� �̵��ϸ� �ǹ��� ������ ���� �����Ͱ� �ִ� index ã��
				while(a[pr] < pivot) {pr--;}
			
				// System.out.println(pl+" , "+pr);
				// p1�� ��ġ����, pr��ġ�� ���� ��ȯ�Ѵ�.
				if(pl <= pr) {
					swap(a, pl++, pr--);
				}
			}while(pl<=pr); 

			
			
			// ���� �� ������ �������� ���ȣ��
			if(left<pr) {
				myQuickDesc(a,left,pr);
			}
			// ���� �� ������ �������� ���ȣ��
			if(pl<right) {
				myQuickDesc(a,pl,right);
			}
			
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л� �� �Է�:");
		int cnt = s.nextInt();
		System.out.println("");
		
		int arr[] = new int[cnt]; // �迭 ����

		for(int i = 0; i<arr.length; i++) {
			System.out.print("�л� "+(i+1)+" ���� �Է�:");
			arr[i] = s.nextInt();
		}
	
		System.out.println("");
		System.out.println("���� ������ ����");
		
		myQuickDesc(arr, 0, cnt-1); // �� ����
		
		
		for(int i=1; i<=cnt; i++) {
			System.out.println(i+"�� : " + arr[i-1]);
		}
	}

}
