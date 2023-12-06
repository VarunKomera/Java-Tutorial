package com.anudip.learning;

public class Book {
	
	private int bkid;
	private String bktitle;
	private double price;
	
	@Override
	public String toString() {
		return "Book [bkid=" + bkid + ", bktitle=" + bktitle + ", price=" + price + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBkid() {
		return bkid;
	}

	public String getBktitle() {
		return bktitle;
	}

	public double getPrice() {
		return price;
	}

	public void setBkid(int bkid) {
		this.bkid = bkid;
	}

	public void setBktitle(String bktitle) {
		this.bktitle = bktitle;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int bkid, String bktitle, double price) {
		super();
		this.bkid = bkid;
		this.bktitle = bktitle;
		this.price = price;
	}
	
	

}