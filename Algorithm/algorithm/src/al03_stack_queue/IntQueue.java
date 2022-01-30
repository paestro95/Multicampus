package al03_stack_queue;

public class IntQueue {
	int capacity; // ť�� ũ��
	int queue[];// ť�� �޸𸮸� ����
	
	int front; // ���� �� ��ġ
	int rear; // ������ ��ġ
	int dataCnt; // queue�� ������ ���� 
	
	public IntQueue() {}
	public IntQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity]; // ��ü ����

		// front =0;
		// rear = 0;
		// dataCnt = 0;
		// front = rear = dataCnt = 0;
		
		
	}
	
	// ť�� �����͸� �߰��ϴ� �޼ҵ� (enqueue)
	public int enqueue(int data) {
		// �����Ͱ� ���� á���� Ȯ�� 
		// capacity : �뷮, dataCnt : ���� ������ �� 
		
		if(capacity<=dataCnt) { // �����÷ο� �߻�
			throw new QueueOverFlowException();
		}
		// �����͸� ť�� ��´�. (rear : ��ġ��)
		queue[rear++] = data;
		dataCnt++;// �������� �� ���� 
		// rear��ġ�� �������� ó���ϱ�
		if(rear == capacity) {
			rear = 0;
		}
		System.out.println("rear->"+rear+", ���� ������=" + dataCnt);
		
		return data;
	}
	
	
	// ť���� �����͸� ������ �޼ҵ�
	public int dequeue() throws QueueEmptyException {
		if(dataCnt<=0) { // ť�� �����Ͱ� ���� �� 
			throw new QueueEmptyException();
		}
		// ť�� �����Ͱ� ���� �� ���� �� 
		dataCnt--;// ���� ��ü�� ���� 1���� 
		int deData = queue[front++];
		if(front == capacity) {
			front=0;
		}
		System.out.println("front->"+front+", ���� �����ͼ� ="+dataCnt);
		return deData;
		
	}
	
	// ť�� ���� ��(front) �����͸� ���Ѵ�
	public int peek() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		return queue[front];
	}
	
	// ť�� ũ�� (4)
	public int getCapacity() {
		return capacity;
	}
	
	// ť�� ������ �� (4)
	public int getSize() {
		return dataCnt;
	}
	
	// front Index (4)
	public int getFrontIndex() {
		return front;
	}
	
	// rear Index (4)
	public int getRearIndex() {
		return rear;
	}
	
	// ������ ��
	public int getRearData() {
		return queue[rear-1];
	}
	
	
	
	// ť�� ������� �� Empty ���� Ŭ����
	class QueueEmptyException extends RuntimeException{
		QueueEmptyException(){}
	}
	
	// �����÷ο� �߻��� ó���� ����ó��
	class QueueOverFlowException extends RuntimeException{
		QueueOverFlowException(){}
	}
	
	

}
