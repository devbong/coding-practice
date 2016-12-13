package io.devbong.coding.practice.newemployee;

import org.apache.commons.lang3.StringUtils;

public class PalindromeMakerProcessor {

	public static void main(String[] args) {

		PalindromeMaker palindromeMaker = new PalindromeMaker();
		System.out.println(palindromeMaker.getPalindromeCount("ca"));

	}

	private static class PalindromeMaker {

		public boolean isPalin(String input) {
			char[] chars = input.toCharArray();

			for (int i = 0; i < chars.length; i++) {
				if (chars[i] != chars[chars.length - 1 - i]) {
					return false;
				}
			}

			return true;
		}

		public int getPalindromeCount(String input) {

			if(isPalin(input)) {
				return -1;
			}

			int count = 0;

			char[] chars = input.toCharArray();

			for (int i = 0; i < chars.length; i++) {

				String checkStr = "";

				String revStr = input.substring(0, i);
				revStr = StringUtils.reverse(revStr);

				checkStr += revStr;

				if (isPalin(checkStr)) {
					count = input.length() + i;
					break;
				}
			}

			return count;
		}

	}
}