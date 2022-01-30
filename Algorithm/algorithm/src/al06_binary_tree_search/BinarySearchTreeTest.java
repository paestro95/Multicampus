package al06_binary_tree_search;

import java.util.Scanner;

public class BinarySearchTreeTest {
	static Scanner s = new Scanner(System.in);
	
	// �����͸� ���� ��ü 
	static class Data {
		private Integer no; // �Է� ���� ��ȣ 
		private String name; // �Է� ���� �̸� 
		
		// 
		 final int NO = 1; // ��ȣ�� �Է� ������ Ȯ��
		 final int NAME = 2; // �̸��� �Է� ������ Ȯ��
		
		
		// ��ȣ�� ���� �� �ִ� �޼ҵ� 
		Integer getKeyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		

		// ������ �Է¹޴� �޼ҵ� 
		public void inData(String msg, int sw) {
			System.out.println(msg+"�Է��ϼ���.");
			
			if((sw&NO)==NO) {
				System.out.print("��ȣ:");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME)==NAME) {
				System.out.print("�̸�:");
				name = s.nextLine();
			}
		}
	} // Data
	// Menu
	enum Menu{
		ADD("ȸ���߰�"),
		REMOVE("����"),
		SEARCH("�˻�"),
		PRINT("���"),
		TERMINATE("����");
		private final String message;
		
		Menu(String msg){
			message = msg;
		}
		String getMessage() {
			return message;
		}
		
		// ����� �Է��� �޴���ü�� �����ϴ� �޼ҵ�
		static Menu menuAt(int idx) {
			for(Menu m : Menu.values()) {
				if(m.ordinal()==idx) {
					return m;
				}
			}
			return null;
		}
	}
	
	// Menu
	// �޴� ����ϰ� ����ڿ��� �޴��� �Է¹��� �޼ҵ�
	// ��ȯ�� : ������ �޴� ��ü
	static Menu selectMenu() {
		int menuNo;
		do { // �޴��� �߸� �Է��ϸ� �ٸ� �޴��� �Է¹ޱ� ���ؼ� �ݺ��� �����Ѵ�.
			for(Menu m : Menu.values()) { // �޴� ���
				System.out.printf("%d.%s ",m.ordinal(),m.getMessage());
			} 
			System.out.print(":");
			menuNo = Integer.parseInt(s.nextLine());
		}while(menuNo < Menu.ADD.ordinal() || menuNo>Menu.TERMINATE.ordinal());
		return Menu.menuAt(menuNo);
	}
	public static void main(String[] args) {
		Menu m;
		
		BinaryTree<Integer,Data> tree = new BinaryTree<Integer, Data>();
		Data data;
		do {
			m = selectMenu(); // ����ڰ� ������ �޴�
			switch(m) {
			case ADD://��ȣ, �̸��� �Է¹޾� Node -> tree�� ���� 
				data = new Data();
				data.inData("ȸ������",data.NO | data.NAME);
				// ���ο� ��� �߰��ϱ�
				tree.add(data.getKeyCode(),data);
				break;
				
				
			case REMOVE:
				//������ Ű�� �Է¹ޱ� 
				data = new Data();
				data.inData("������ key", data.NO);
				boolean result = tree.remove(data.getKeyCode());
				/*if(result) {
					System.out.println(data.getKeyCode()+"�� ȸ���� �����Ǿ����ϴ�.");
				}else {
					System.out.println("ȸ�������� �����ϴ�.");
				} */
				break;
				
				
			case SEARCH:
				data = new Data();
				data.inData("�˻��� key",data.NO); // key�� �����
				// �˻��� ����� ���Ϲ޴´�.
				Data searchData = tree.search(data.getKeyCode());
				if(searchData==null) {
					System.out.println("�ش�Ű�� ȸ�� ������ �������� �ʽ��ϴ�.");
				}else { // �˻��� ����� ���� ��
					System.out.println("��ȣ:"+searchData.getKeyCode()+", �̸�:" + searchData);
				}
				break;
				
				
			case PRINT: 
				tree.print();
			}
		}while(m != Menu.TERMINATE);
		// ���α׷��� �����
	}

}