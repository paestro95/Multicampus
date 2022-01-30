package algorismProject1;

import java.util.Arrays;
import java.util.Scanner;

/*
퀵 정렬 알고리즘을 사용하여 정렬 
입력한 학생 수 만큼 점수를 입력하고 성적순으로 정렬하여 출력
*/

public class quickSort {
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
		
		System.out.print("학생 수 입력:");
		int cnt = s.nextInt();
		System.out.println("");
		
		int arr[] = new int[cnt]; // 배열 생성

		for(int i = 0; i<arr.length; i++) {
			System.out.print("학생 "+(i+1)+" 점수 입력:");
			arr[i] = s.nextInt();
		}
	
		System.out.println("");
		System.out.println("성적 순으로 정렬");
		
		myQuickDesc(arr, 0, cnt-1); // 퀵 정렬
		
		
		for(int i=1; i<=cnt; i++) {
			System.out.println(i+"등 : " + arr[i-1]);
		}
	}

}
