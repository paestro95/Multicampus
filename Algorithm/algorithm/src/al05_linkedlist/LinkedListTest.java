package al05_linkedlist;

public class LinkedListTest<E> {
	// ��� Ŭ���� 
	class Node<E>{
		private E data;
		private Node<E> next; // ���� ���
		Node(E data, Node<E> next){
			this.data = data; 
			this.next = next;
		}
		
	}
	
	// 
	public LinkedListTest() {
		// head, current�� �ʱ�ȭ
		head = null; 
		current = null;
	}

	// �Ӹ� ��带 ������ ���� 
	private Node<E> head;
	private Node<E> current;
	
	// �Ӹ� ��� ���� 
	public void addFirst(E data) {
		// ���� ���� ��� 
		Node<E> point = head;
		head = current = new Node<E>(data, point);
	}
	
	// ������ ��� ����
	public void addLast(E data) {
		if(head == null) { // ����� ����Ʈ�� ����.
			addFirst(data);
		} else { // ����� ����Ʈ�� �ִ�.
			Node<E> point = head; 
			while(point.next != null) {
				point = point.next;
			}
			// point�� next�� null�� ����̴�.
			current = point.next = new Node<E>(data,null); 
		}
	}
	
	// �Ӹ� ��� ����
	public void removeFirst() {
		if(head!=null) { // ��尡 �����ϸ�
			current	= head = head.next;
		}
	}
	
	// ��� ���� 
	public void remove(Node<E> delNode) {
		if(head != null) { // ��� ���� ���
			if(head == delNode) { // ������ ��尡 head������� Ȯ��
				removeFirst();
			} else {
				Node<E> point = head;
				while(point.next != delNode) { // delNode�� �� ��� ã�� 
					point = point.next;
				}
				// point�� delNode�� ���� ����̴�.
				point.next = delNode.next;
				current = point;
			}
		}
	}
	
	// ���� ��� ����
	public void removeCurrent() {
		remove(current);
	}
	
	
	// ��� ��� ���
	public void dump() {
		Node<E> point = head;
		while(point != null) {
		System.out.println(point.data);
		point = point.next;
		}
	}
}
