package javaProject2;

class Book {
	protected int bookNo;
	protected String bookTitle;
	protected String bookAuthor;
	protected int bookYear;
	protected int bookPrice;
	protected String bookPublisher;

	public Book(int bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String toString() {
		return this.bookNo + "\t" + this.bookTitle + "\t" + this.bookAuthor + "\t" + this.bookPrice + "\t"
				+ this.bookYear + "\t" + this.bookPublisher + "\t";
	}

}

class Magazine extends Book {
	private int Month;

	public Magazine(int bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher,
			int Month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.Month = Month;
	}

	public String toString() {
		return super.bookNo + "\t" + super.bookTitle + "\t" + super.bookAuthor + "\t" + super.bookPrice + "\t"
				+ super.bookYear + "\t" + super.bookPublisher + "\t" + this.Month;
	}

}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(001, "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
		Book b2 = new Book(002, "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
		Book b3 = new Book(003, "HTML/CSS", "������", 18000, 2021, "�������ǻ�");

		Magazine m1 = new Magazine(001, "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5);
		Magazine m2 = new Magazine(002, "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7);
		Magazine m3 = new Magazine(003, "���� ����", "������", 18000, 2021, "�������ǻ�", 9);

		System.out.println("������ȣ\t������\t\t����\t����\t������\t���ǻ�");
		System.out.println("----------------------------------------------------------");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

		System.out.println("");
		System.out.println("");

		System.out.println("������ȣ\t������\t����\t����\t������\t���ǻ�\t�����");
		System.out.println("------------------------------------------------------------------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
