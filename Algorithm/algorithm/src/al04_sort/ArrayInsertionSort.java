package al04_sort;
import java.util.Arrays;
import java.util.Random;

public class ArrayInsertionSort {

	// 삽입정렬 (Insert Sort)
	static void mySort(int a[], int n) {
		for(int i=1; i<n; i++) { // 1,2,3,4,5,6,7,8,9
			int temp = a[i]; //97
			int j;
			for (j=1; j>0 && a[j-1] > temp; j--) {
				a[j]=a[j-1];
			}
			a[j]=temp;	
		}
	}
	
	
	
	public static void main(String[] args) {
		Random r = new Random(); 
		
		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100); // 0 ~ 99 
		}
		
		System.out.println("정렬전->"+ Arrays.toString(a));
		mySort(a,a.length);
		System.out.println("정렬후->"+ Arrays.toString(a));
	}
}
