package al04_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {

	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 버블정렬 : 오름차순 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 정렬 기준 코드를 알아둬야함.
	public static void mySort(int a[], int n) { // 데이터배열, 데이터수
		
		for(int i = 0; i<n-1; i++) { // i = 0,1,2,3,4 ... n-1
		//        9      1
		for(int j=n-1; j>0; j-- ) {
			
			//    8       9
			if(a[j-1] > a[j]) { 
				//교환
			  	//       8   0 
				swap(a, j-1, j);
			}
		}
		
	}
}
	
	public static void main(String[] args) {
		Random ran = new Random();
		// 데이터 준비
		// 1~100까지의 난수를 생성하여 크기순으로 정렬(오름차순) 
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1; // 0~99
		}
		
		System.out.println("정렬전:"+ Arrays.toString(arr));
		
		mySort(arr,arr.length);
		System.out.println("정렬후:" + Arrays.toString(arr));
	}

}
