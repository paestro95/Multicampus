
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
				// �����ͺ��̽����� ȸ������ ��ü�� �����Ͽ� �ֿܼ� ���
				// DAO�� ���� �޾ƿ� ���
				bookAllList();
			} else if (menu == 2) {
				// ȸ�����
				bookInsert();
			} else if (menu == 3) {
				System.exit(0);
			} else {
				System.out.println("�߸��� �Է��� �ϼ̽��ϴ�.");
			}
		} // while ��
	}

	public void bookInsert() {
		// ����� ȸ�������� �Է¹޾� DTO��ü setter�� �Ѵ�.
		BookDTO dto = new BookDTO();

		System.out.printf("���� ��ȣ->");
		dto.setBookNo(scan.nextLine());
		System.out.printf("���� ����->");
		dto.setBookTitle(scan.nextLine());
		System.out.printf("����->");
		dto.setBookAuthor(scan.nextLine());
		System.out.printf("���࿬��->");
		dto.setBookYear(Integer.parseInt(scan.nextLine()));
		System.out.printf("����->");
		dto.setBookPrice(Integer.parseInt(scan.nextLine()));
		System.out.printf("���ǻ�->");
		dto.setBookPublisher(scan.nextLine());

		BookDAO dao = new BookDAO();
		int result = dao.insertBook(dto);
		if (result > 0) { // ȸ�����
			System.out.println(dto.getBookTitle() + "�� ������ ��ϵǾ����ϴ�.");
		} else { // ��Ͻ���
			System.out.println("��������� �����Ͽ����ϴ�.");
		}
	}

	// ������ ����ϴ� �޼���
	public void menuOutput() {
		System.out.print("[�޴�] 1.�����������, 2.�������, 3.���� : ");

	}

	// ��ü ȸ����� �����ϱ�
	public void bookAllList() {
		BookDAO dao = new BookDAO();
		// dao.memberList2();
		List<BookDTO> list = dao.bookList();

		// size(); : ��ü�� ��
		for (int idx = 0; idx < list.size(); idx++) { // 0,1,2,3, ...
			// list���� index ��ġ�� �ִ� ��ü�� ���Ͽ� (DTO) �ֿܼ� ����Ѵ�
			BookDTO dto = list.get(idx); // 1���� ȸ��
			// ���
			oneBookOutput(dto);
		}

	}

	public void oneBookOutput(BookDTO dto) {
		// ��ȣ, �̸�, ����ó, �̸���, ����, ����, �����
		System.out.printf("%s\t %s\t %s\t %d\t %d\t %s \n", dto.getBookNo(), dto.getBookTitle(), dto.getBookAuthor(),
				dto.getBookYear(), dto.getBookPrice(), dto.getBookPublisher());
	}

	public static void main(String[] args) {
		new BookTest().start();

	}

	public void bookList() {
		BookDAO dao = new BookDAO();
		dao.bookList(); // ���ȸ�����
	}

}
