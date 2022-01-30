
package al04_sort;


import java.util.Arrays;
import java.util.Scanner;

public class QuickSortEx {
		public static void swap(int a[], int idx1, int idx2) {
			int temp = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = temp;
		}
		
		
		// 오름차순, 내림차순
		// Quick 정렬 메소드
		public static void myQuickDesc(int a[], int left, int right) {
			int pl = left; // 왼쪽부터 검색할 index 위치
			int pr = right; // 오른쪽부터 검색할 index 위치
			int pivot = a[(left+right)/2]; // 피벗위치의 값을 구한다.
			
			do {
				// 피벗기준 왼쪽에서 오른쪽으로 피벗의 값보다 큰 데이터가 있는 index 찾기
				while(a[pl] > pivot) {pl++;}
				// 피벗기준 오른쪽에서 왼쪽으로 이동하며 피벗의 값보다 작은 데이터가 있는 index 찾기
				while(a[pr] < pivot) {pr--;}
			
				// System.out.println(pl+" , "+pr);
				// p1의 위치값과, pr위치의 값을 교환한다.
				if(pl <= pr) {
					swap(a, pl++, pr--);
				}
			}while(pl<=pr);

			
			
			// 정렬 후 왼쪽을 재정렬할 재귀호출
			if(left<pr) {
				myQuickDesc(a,left,pr);
			}
			// 정렬 후 오른쪽 재정렬할 재귀호출
			if(pl<right) {
				myQuickDesc(a,pl,right);
			}
			
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어점수의 갯수:");
		int cnt = s.nextInt();
		
		int arr[] = new int[cnt]; // 배열 생성

		for(int i = 0; i<arr.length; i++) {
			System.out.print("국어점수"+(i+1)+":");
			arr[i] = s.nextInt();
		}
	
		myQuickDesc(arr, 0, cnt-1); // 퀵 정렬
		
		for(int i=1; i<=cnt; i++) {
			System.out.println(i+"등 : " + arr[i-1]);
		}
	}

}


/*

 국어 점수를 입력받아 점수순으로 출력하라 
 퀵정렬을 이용하라.
 
점수의 수 : 5
점수1 = 56
점수2 = 92
점수3 = 95
점수4 = 85
점수5 = 56


점수순으로 출력
1등 : 95
2등 : 92
3등 : 85
4등 : 56
5등 : 56
*/
