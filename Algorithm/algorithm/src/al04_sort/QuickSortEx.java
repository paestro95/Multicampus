
package al04_sort;


import java.util.Arrays;
import java.util.Scanner;

public class QuickSortEx {
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
		
		System.out.print("���������� ����:");
		int cnt = s.nextInt();
		
		int arr[] = new int[cnt]; // �迭 ����

		for(int i = 0; i<arr.length; i++) {
			System.out.print("��������"+(i+1)+":");
			arr[i] = s.nextInt();
		}
	
		myQuickDesc(arr, 0, cnt-1); // �� ����
		
		for(int i=1; i<=cnt; i++) {
			System.out.println(i+"�� : " + arr[i-1]);
		}
	}

}


/*

 ���� ������ �Է¹޾� ���������� ����϶� 
 �������� �̿��϶�.
 
������ �� : 5
����1 = 56
����2 = 92
����3 = 95
����4 = 85
����5 = 56


���������� ���
1�� : 95
2�� : 92
3�� : 85
4�� : 56
5�� : 56
*/
