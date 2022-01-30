package al03_stack_queue;

public class IntStack {
	int capacity; // �ִ�� ������ �� �ִ� ��ü�� ��
	int stk[]; // ������ ������ �� �ִ� �迭�� ����
	int point; // stack�� ä���� ���� ��ġ + 1

	
	IntStack() {
	}

	IntStack(int max) {
		capacity = max; // ���� ������ �� �ִ� ũ��
		point = 0;
		stk = new int[max];
	}
	
	// �������� ���� �����ϴ� �޼ҵ�
	public int getSize() {
		return point;
	}
	// �޸�ũ�⸦ �����ϴ� �޼ҵ�
	public int getCapacity() {
		return capacity;
	}
	// ���ÿ� �����͸� �߰��ϴ� �޼ҵ�
	public int push(int data) throws OverflowIntStackException {
		if(point>=capacity) {
			throw new OverflowIntStackException();
		}
		return stk[point++] = data;
	}
	// ������ ���� ���߿� ����� ��ġ(point-1)�� ���� �����ϴ� �޼ҵ�
	public int pop() throws EmptyIntStackException {
		// ������ ��� ������ empty ���ܹ߻���Ŵ
		if(point<=0) {
			throw new EmptyIntStackException();
			
		}
		return stk[--point];
	}
	
	// ���� ��(point-1)�� �ִ� �����͸� �����ϴ� �޼ҵ�
	public int Peek() throws EmptyIntStackException{
		if(point<=0) {
			throw new EmptyIntStackException();
		}
		return stk[point-1];
	}
	
	// stack�� ��� ������ ����ϱ� 
	public void print() {
		if(point<=0) {
			System.out.println("������ ����� �ֽ��ϴ�.");
		}else {
			for(int i = 0; i<point; i++) {
				System.out.println("stk["+i+"]="+ stk[i]);
			}
		}
	}
	
	// �������� index���ϱ�
	public int indexOf(int search) {
		for(int i=point-1; point>=0; i--) { // point-1, point-2, point-3 
			if(stk[i]==search) {
				return i;
			}
		}
		return -1;
	}
	
	// stack�� �����Ͱ� �����ϴ��� Ȯ���ϴ� �޼ҵ�
	public boolean isEmpty() {
		// ��������� true, �����Ͱ� 1���� ������ false
		// return (point<=0)? true:false;
		return point<=0;
	}
	
	
	public boolean isFull() {
		return point>=capacity;
	}
	// �����÷ο� �߻��� ����ó�� Ŭ����
	class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {};
	}
	
	// ������ ������� �� �߻���ų ����ó�� Ŭ���� 
	class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {};
	}
}
