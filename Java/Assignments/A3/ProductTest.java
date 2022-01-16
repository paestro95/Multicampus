package javaProject1;

class Product {
	private int prdNo;
	private String prdName;
	private int prdPrice;
	private int prdYear;
	private String prdMaker;

	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	public int getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdYear() {
		return prdYear;
	}

	public void setPrdYear(int prdYear) {
		this.prdYear = prdYear;
	}

	public String getPrdMaker() {
		return prdMaker;
	}

	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}

	public String toString() {
		return this.prdNo + "\t" + this.prdName + "\t" + this.prdPrice + "\t" + this.prdYear + "\t" + this.prdMaker
				+ "\t";
	}

}

public class ProductTest {
	public static void main(String[] args) {

		Product p1 = new Product(001, "노트북", 1200000, 2021, "삼성");
		Product p2 = new Product(002, "모니터", 300000, 2021, "LG");
		Product p3 = new Product(003, "마우스", 30000, 2020, "로지텍");

		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("---------------------------------------");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}