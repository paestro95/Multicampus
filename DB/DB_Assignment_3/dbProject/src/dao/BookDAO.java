package dao;

import java.util.List;
import java.util.ArrayList;
import dbConn.MysqlConnection;
import dto.BookDTO;

public class BookDAO extends MysqlConnection {
	public List<BookDTO> bookList() {
		// dto��ü ���� ArrayList��ü�� �����Ѵ�.
		List<BookDTO> list = new ArrayList<BookDTO>();
		try {
			getConn(); // DB���� - MysqlConnection���� �޾ƿ�

			// select
			String sql = "select bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher"
					+ " from book order by bookNo";
			pstmt = conn.prepareStatement(sql);

			// rs
			rs = pstmt.executeQuery();

			while (rs.next()) { // rs.next() - ���ڵ� ���� ���� ������
				BookDTO dto = new BookDTO(); // �� ����� ������ ������ �� �ִ� ���� ����
				dto.setBookNo(rs.getString(1));
				dto.setBookTitle(rs.getString(2));
				dto.setBookAuthor(rs.getString(3));
				dto.setBookYear(rs.getInt(4));
				dto.setBookPrice(rs.getInt(5));
				dto.setBookPublisher(rs.getString(6));

				list.add(dto); // �÷��ǿ� ����� ������ �߰� - why? �ٸ� ������ �ޱ� ����
			}

		} catch (Exception e) {
			System.out.println("ȸ������ ���� �߻�");
			e.printStackTrace();
		} finally {

		}

		// ������ ��� �� ��ŭ dto�� ����

		return list;
	}

	// ȸ����ü ��� ( *** return�� ���� �޼ҵ� ***)
	public void selectBook() {
		try {
			getConn();
			String sql = "select bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher "
					+ " from book order by bookNo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// å��ȣ, å����, ����, ������, ����, ���ǻ�
				System.out.printf("%s %s %s %d %d %s \n", rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getInt(5), rs.getString(6));
			}
		} catch (Exception e) {

		} finally {
			dbClose();
		}

	}

	// ȸ�����
	public int insertBook(BookDTO bookDTO) {
		int result = 0; // ����� ���Ͻ�ų ����
		try {
			getConn();

			String sql = "insert into book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher)"
					+ "values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookDTO.getBookNo()); // ���� ����
			pstmt.setString(2, bookDTO.getBookTitle());
			pstmt.setString(3, bookDTO.getBookAuthor());
			pstmt.setInt(4, bookDTO.getBookYear());
			pstmt.setInt(5, bookDTO.getBookPrice());
			pstmt.setString(6, bookDTO.getBookPublisher());

			// �߰��� ���ڵ��� ���� ��ȯ
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("ȸ����Ͽ��ܹ߻�....");
			e.printStackTrace();

		} finally {
			dbClose();
		}
		return result;

	}

}
