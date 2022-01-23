
import java.util.List;
import java.util.Scanner;

import dao.BookDAO;
import dto.BookDTO;

public class BookTest {

	Scanner scan = new Scanner(System.in);

	public void start() {
		while (true) {
			menuOutput();
			int menu = Integer.parseInt(scan.nextLine());
			if (menu == 1) {
				// 데이터베이스에서 회원정보 전체를 선택하여 콘솔에 출력
				// DAO에 값을 받아와 출력
				bookAllList();
			} else if (menu == 2) {
				// 회원등록
				bookInsert();
			} else if (menu == 3) {
				System.exit(0);
			} else {
				System.out.println("잘못된 입력을 하셨습니다.");
			}
		} // while 문
	}

	public void bookInsert() {
		// 등록할 회원정보를 입력받아 DTO객체 setter를 한다.
		BookDTO dto = new BookDTO();

		System.out.printf("도서 번호->");
		dto.setBookNo(scan.nextLine());
		System.out.printf("도서 제목->");
		dto.setBookTitle(scan.nextLine());
		System.out.printf("저자->");
		dto.setBookAuthor(scan.nextLine());
		System.out.printf("발행연도->");
		dto.setBookYear(Integer.parseInt(scan.nextLine()));
		System.out.printf("가격->");
		dto.setBookPrice(Integer.parseInt(scan.nextLine()));
		System.out.printf("출판사->");
		dto.setBookPublisher(scan.nextLine());

		BookDAO dao = new BookDAO();
		int result = dao.insertBook(dto);
		if (result > 0) { // 회원등록
			System.out.println(dto.getBookTitle() + "의 정보가 등록되었습니다.");
		} else { // 등록실패
			System.out.println("도서등록이 실패하였습니다.");
		}
	}

	// 제목을 출력하는 메서드
	public void menuOutput() {
		System.out.print("[메뉴] 1.보유도서목록, 2.도서등록, 3.종료 : ");

	}

	// 전체 회원목록 선택하기
	public void bookAllList() {
		BookDAO dao = new BookDAO();
		// dao.memberList2();
		List<BookDTO> list = dao.bookList();

		// size(); : 객체의 수
		for (int idx = 0; idx < list.size(); idx++) { // 0,1,2,3, ...
			// list에서 index 위치에 있는 객체를 구하여 (DTO) 콘솔에 출력한다
			BookDTO dto = list.get(idx); // 1명의 회원
			// 출력
			oneBookOutput(dto);
		}

	}

	public void oneBookOutput(BookDTO dto) {
		// 번호, 이름, 연락처, 이메일, 생년, 성별, 등록일
		System.out.printf("%s\t %s\t %s\t %d\t %d\t %s \n", dto.getBookNo(), dto.getBookTitle(), dto.getBookAuthor(),
				dto.getBookYear(), dto.getBookPrice(), dto.getBookPublisher());
	}

	public static void main(String[] args) {
		new BookTest().start();

	}

	public void bookList() {
		BookDAO dao = new BookDAO();
		dao.bookList(); // 모든회원출력
	}

}
