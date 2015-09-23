/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *	 |_ Movie
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author	: 허석민
 * @verson	: 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitage) {
		this.title = title;
		this.limitAge = limitage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
}
