package algorismProject2;

import java.util.Scanner;

public class Binary_Tree_Search {

	static Scanner s = new Scanner(System.in);
	
	// 데이터를 담을 객체 
	static class Data {
		private Integer no; // 입력 받은 번호 
		private String name; // 입력 받은 이름 
		
		// 
		 final int NO = 1; // 번호를 입력 받을지 확인
		 final int NAME = 2; // 이름을 입력 받을지 확인
		
		
		// 번호를 얻을 수 있는 메소드 
		Integer getKeyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		

		// 데이터 입력받는 메소드 
		public void inData(String msg, int sw) {
			System.out.println("");
			System.out.println(msg);
			
			if((sw&NO)==NO) {
				System.out.print("상품 번호 입력:");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME)==NAME) {
				System.out.print("상품명 입력:");
				name = s.nextLine();
				System.out.println("");
			}
		}
	} // Data
	// Menu
	enum Menu{
		ADD("상품 등록"),
		REMOVE("상품 삭제"),
		SEARCH("상품 검색"),
		PRINT("전체 상품 조회"),
		TERMINATE("종료"),
		ERROR("에러");
		private final String message;
		
		Menu(String msg){
			message = msg;
		}
		String getMessage() {
			return message;
		}
		
		// 사용자 입력한 메뉴객체를 리턴하는 메소드
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
	// 메뉴 출력하고 사용자에게 메뉴를 입력받은 메소드
	// 반환형 : 선택한 메뉴 객체
	static Menu selectMenu() {
		int menuNo;
//		do { // 메뉴를 잘못 입력하면 다른 메뉴를 입력받기 위해서 반복을 실행한다.
//			for(Menu m : Menu.values()) { // 메뉴 출력
			for(int i = 0; i<Menu.values().length-1; i++) {
				Menu m = Menu.values()[i];
				System.out.printf("(%d) %s ",m.ordinal()+1,m.getMessage());
			} 
			System.out.print("\n메뉴 선택 : ");
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
			m = selectMenu(); // 사용자가 선택한 메뉴
			switch(m) {
			case ADD://번호, 이름을 입력받아 Node -> tree에 저장 
				data = new Data();
				data.inData("상품 등록",data.NO | data.NAME);
				// 새로운 노드 추가하기
				tree.add(data.getKeyCode(),data);
				break;
				
				
			case REMOVE:
				//삭제할 키를 입력받기 
				data = new Data();
				data.inData("상품 삭제", data.NO);
				boolean result = tree.remove(data.getKeyCode());
				break;
				
				
			case SEARCH:
				data = new Data();
				data.inData("상품 검색",data.NO); // key가 저장됨
				// 검색한 결과를 리턴받는다.
				Data searchData = tree.search(data.getKeyCode());
				if(searchData==null) {
					System.out.println("등록된 상품이 없습니다.\n");
				}else { // 검색한 결과가 있을 때
					System.out.println("상품명 : " + searchData +"\n");
				}
				break;
				
				
			case PRINT: 
				tree.print();
				System.out.println("");
				break;
				
			case TERMINATE:
				System.out.println("종료합니다");
				break;
				
			case ERROR:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
			if(m == Menu.TERMINATE) break;
		};

		// 프로그램이 종료됨
	}

}
