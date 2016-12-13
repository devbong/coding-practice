package io.devbong.coding.practice.interviewbook;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("abcd", "cdab"));
		System.out.println(isAnagram2("abcdefg!!", "bcdefg!?a"));
	}

	public static boolean isAnagram(String source, String target) {

		char[] sourceChars = source.toCharArray();
		char[] targetChars = target.toCharArray();

		if (sourceChars.length != targetChars.length) {
			return false;
		}

		Arrays.sort(sourceChars);
		Arrays.sort(targetChars);

		return Arrays.equals(sourceChars, targetChars);
	}

	public static boolean isAnagram2(String source, String target) {

		char[] sourceChars = source.toCharArray();
		char[] targetChars = target.toCharArray();

		if (sourceChars.length != targetChars.length) {
			return false;
		}

		int[] checkArr = new int[256];

		for (char eachChar : sourceChars) {
			checkArr[eachChar]++;
		}

		for (char eachChar : targetChars) {
			if (--checkArr[eachChar] < 0) {
				return false;
			}
		}

		return true;
	}
}
