package com.algorithms.string;

/***
 * Remove duplicate, trailing and heading white spaces from the String.
 * 
 * @author dell
 *
 */
public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "    hello     world    ";
		str = str.trim().replaceAll("\\s+", " ");
		System.out.println(str);
	}
}
