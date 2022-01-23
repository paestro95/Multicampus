package dao;

import java.util.List;
import java.util.ArrayList;
import dbConn.MysqlConnection;
import dto.BookDTO;

public class BookDAO extends MysqlConnection {
	public List<BookDTO> bookList() {
		// dto객체 담을 ArrayList객체를 생성한다.
		List<BookDTO> list = new ArrayList<BookDTO>();
		try {
			getConn(); // DB연결 - MysqlConnection에서 받아옴

			// select
			String sql = "select bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher"
					+ " from book order by bookNo";
			pstmt = conn.prepareStatement(sql);

			// rs
			rs = pstmt.executeQuery();

			while (rs.next()) { // rs.next() - 레코드 수가 끝날 때까지
				BookDTO dto = new BookDTO(); // 한 사람의 정보를 저장할 수 있는 변수 생성
				dto.setBookNo(rs.getString(1));
				dto.setBookTitle(rs.getString(2));
				dto.setBookAuthor(rs.getString(3));
				dto.setBookYear(rs.getInt(4));
				dto.setBookPrice(rs.getInt(5));
				dto.setBookPublisher(rs.getString(6));

				list.add(dto); // 컬렉션에 사람의 정보를 추가 - why? 다른 정보를 받기 위함
			}

		} catch (Exception e) {
			System.out.println("회원선택 예외 발생");
			e.printStackTrace();
		} finally {

		}

		// 생성된 사람 수 만큼 dto에 넣음

		return list;
	}

	// 회원전체 목록 ( *** return이 없는 메소드 ***)
	public void selectBook() {
		try {
			getConn();
			String sql = "select bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher "
					+ " from book order by bookNo";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 책번호, 책제목, 저자, 발행일, 가격, 출판사
				System.out.printf("%s %s %s %d %d %s \n", rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getInt(5), rs.getString(6));
			}
		} catch (Exception e) {

		} finally {
			dbClose();
		}

	}

	// 회원등록
	public int insertBook(BookDTO bookDTO) {
		int result = 0; // 결과를 리턴시킬 변수
		try {
			getConn();

			String sql = "insert into book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher)"
					+ "values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookDTO.getBookNo()); // 값을 셋팅
			pstmt.setString(2, bookDTO.getBookTitle());
			pstmt.setString(3, bookDTO.getBookAuthor());
			pstmt.setInt(4, bookDTO.getBookYear());
			pstmt.setInt(5, bookDTO.getBookPrice());
			pstmt.setString(6, bookDTO.getBookPublisher());

			// 추가된 레코드의 수를 반환
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("회원등록예외발생....");
			e.printStackTrace();

		} finally {
			dbClose();
		}
		return result;

	}

}
