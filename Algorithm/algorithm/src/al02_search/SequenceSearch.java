package al02_search;
import java.util.Scanner;
// �����˻�(LinearSearch, SequenceSearch)
// ���������� �˻��Ѵ�.

public class SequenceSearch {
	//for���� �̿��Ͽ� �˻��ϱ�
	// key�� ���� �ִ� ��ġ�� ���Ͽ� index�� ��ȯ�ϴ� �޼ҵ�

	static int linearSearch1(int[] data, int n, int key) { // �����Ͱ� ��� �迭, ������ ��
		// �迭���� key ���� �˻��Ͽ� index�� �����Ѵ�
		// ���� �˻��� index�� ������ -1 ���� 
		for (int i=0; i<n; i++) { // 0,1,2,3 ... 
			if(data[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	static int linearSearch2(int[] d, int n, int k) {
		int i=0;
		while(true) {
			if(i==n) { // i index��ġ�� �����ϴ°�
				return -1;
			}
			if(d[i]== k) { // �˻��� �����͸� ã�� ���
				return i;
			}
			// ���� index�� ���� Ȯ���ϱ� ���Ͽ� index�� 1���� 
			++i; // ++i, i++, i+i+1, i+=1
		}
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// �������� ���� �Է� : �迭 ����
		System.out.print("�����ͼ�->");
		int n = s.nextInt();
		
		// �迭�� ����
		int data[] = new int[n]; // 5-> 0,1,2,3,4
		
		// ������ �Է�
		for(int i=0; i<n ; i++) {
			System.out.print("data["+i+"]=");
			data[i] = s.nextInt();
		}
		
		// ã�� ���ڸ� �Է� �޴´�.
		System.out.print("�˻��� ������->");
		int key = s.nextInt();
		
		// for�� �̿��� �����˻� ȣ��
		int idx = linearSearch1(data,n,key); // -1, 0,1,2,3....
		if(idx>=0) { // �˻��� �����Ͱ� ���� ��
			System.out.println(key+"�� data["+idx+"]�� �ֽ��ϴ�.");
		}else { // �˻��� �����Ͱ� ���� �� 
			System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
		}
		
		//while���� �̿��� �����˻� ȣ��
		int idx2 = linearSearch2(data,n,key);
		if(idx2>=0) { // �˻��� �����Ͱ� �����Ѵ�.
			System.out.println(key+"�� data["+idx2+"]�� �ֽ��ϴ�.");
		}
		else { // �˻��� �����Ͱ� �������� �ʴ´�.
			System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
		}
		


	}

}
