package com.algorithms.string;

public class SearchOfString {
	public static void main(String[] args) {
		String str = "Hello this is Amod";
		String word = "amod";
		boolean b = checkWordInString(str.toUpperCase(), word.toUpperCase());
		if (b) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}
	}

	private static boolean checkWordInString(String str, String word) {
		char[] ch1 = str.toCharArray();
		char[] ch2 = word.toCharArray();
		int count = 0;
		for (int i = 0; i < ch1.length; i++) {
			int k = i;
			int j = 0;
			while (k < ch1.length && j < ch2.length && ch1[k] == ch2[j]) {
				k++;
				j++;
			}

			if (j == ch2.length) {
				count++;
				System.out.println("Count is " + count);
				return true;
			}
		}

		return false;
	}
}
