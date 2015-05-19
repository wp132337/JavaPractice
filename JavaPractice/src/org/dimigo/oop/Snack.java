package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ Snack
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {}
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param num
	 */
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param num the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack() {
		System.out.println("이름 :" + name);
		System.out.println("제조사 :" + company);
		System.out.println("가격 :" + String.format("%,d", price) + "원");
		System.out.println("개수 :" + number + "개");
		System.out.println();
	}
	
	public int calcPrice() {
		return price * number;
	}
}
