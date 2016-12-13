package io.devbong.coding.practice.interviewbook;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		System.out.println(isDuplicated("abcdefgg"));
		System.out.println(isNotDuplicated("abcdefg"));
	}

	// with set
	public static boolean isDuplicated(String source) {

		Set<Character> characters = new HashSet<Character>();

		for (char c : source.toCharArray()) {
			characters.add(Character.valueOf(c));
		}

		return characters.size() != source.length();
	}

	// without set
	public static boolean isNotDuplicated(String source) {

		if((source.length() > 256)) {
			return false;
		}

		boolean[] tmp = new boolean[256];

		for (int i = 0; i < source.length(); i++) {
			int c = source.charAt(i);
			if (tmp[c] == true) {
				return false;
			}
			tmp[c] = true;
		}

		return true;
	}
}