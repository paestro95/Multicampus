package algorismProject2;

import java.util.Scanner;

public class Binary_Tree_Search {

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
			System.out.println("");
			System.out.println(msg);
			
			if((sw&NO)==NO) {
				System.out.print("��ǰ ��ȣ �Է�:");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME)==NAME) {
				System.out.print("��ǰ�� �Է�:");
				name = s.nextLine();
				System.out.println("");
			}
		}
	} // Data
	// Menu
	enum Menu{
		ADD("��ǰ ���"),
		REMOVE("��ǰ ����"),
		SEARCH("��ǰ �˻�"),
		PRINT("��ü ��ǰ ��ȸ"),
		TERMINATE("����"),
		ERROR("����");
		private final String message;
		
		Menu(String msg){
			message = msg;
		}
		String getMessage() {
			return message;
		}
		
		// ����� �Է��� �޴���ü�� �����ϴ� �޼ҵ�
		static Menu menuAt(int idx) {
//			System.out.println("test size : " + Menu.values().length);
////			for(Menu m : Menu.values()) {
//			for(int i = 0; i<Menu.values().length; i++) {
//				Menu m = Menu.values()[i];
//				System.out.println("test" + i + " : " + m);
////				if(i==idx) {
////					return m;
////				}
//			}
			return Menu.values()[idx];
		}
	}
	
	// Menu
	// �޴� ����ϰ� ����ڿ��� �޴��� �Է¹��� �޼ҵ�
	// ��ȯ�� : ������ �޴� ��ü
	static Menu selectMenu() {
		int menuNo;
//		do { // �޴��� �߸� �Է��ϸ� �ٸ� �޴��� �Է¹ޱ� ���ؼ� �ݺ��� �����Ѵ�.
//			for(Menu m : Menu.values()) { // �޴� ���
			for(int i = 0; i<Menu.values().length-1; i++) {
				Menu m = Menu.values()[i];
				System.out.printf("(%d) %s ",m.ordinal()+1,m.getMessage());
			} 
			System.out.print("\n�޴� ���� : ");
			menuNo = Integer.parseInt(s.nextLine());
//		}while(menuNo < Menu.ADD.ordinal() || menuNo>Menu.TERMINATE.ordinal());
		if(!(0<menuNo && menuNo<6)) return Menu.menuAt(5);
		else return Menu.menuAt(menuNo-1);
	}
	public static void main(String[] args) {
		Menu m;
		
		Binary_Tree<Integer,Data> tree = new Binary_Tree<Integer, Data>();
		Data data;
		while(true) {
			m = selectMenu(); // ����ڰ� ������ �޴�
			switch(m) {
			case ADD://��ȣ, �̸��� �Է¹޾� Node -> tree�� ���� 
				data = new Data();
				data.inData("��ǰ ���",data.NO | data.NAME);
				// ���ο� ��� �߰��ϱ�
				tree.add(data.getKeyCode(),data);
				break;
				
				
			case REMOVE:
				//������ Ű�� �Է¹ޱ� 
				data = new Data();
				data.inData("��ǰ ����", data.NO);
				boolean result = tree.remove(data.getKeyCode());
				break;
				
				
			case SEARCH:
				data = new Data();
				data.inData("��ǰ �˻�",data.NO); // key�� �����
				// �˻��� ����� ���Ϲ޴´�.
				Data searchData = tree.search(data.getKeyCode());
				if(searchData==null) {
					System.out.println("��ϵ� ��ǰ�� �����ϴ�.\n");
				}else { // �˻��� ����� ���� ��
					System.out.println("��ǰ�� : " + searchData +"\n");
				}
				break;
				
				
			case PRINT: 
				tree.print();
				System.out.println("");
				break;
				
			case TERMINATE:
				System.out.println("�����մϴ�");
				break;
				
			case ERROR:
				System.out.println("�߸� �Է��߽��ϴ�.");
				break;
			}
			
			if(m == Menu.TERMINATE) break;
		};

		// ���α׷��� �����
	}

}
