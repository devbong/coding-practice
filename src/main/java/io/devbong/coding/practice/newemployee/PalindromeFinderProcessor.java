package io.devbong.coding.practice.newemployee;

public class PalindromeFinderProcessor {

	public static void main(String[] args) {

		PalindromeFinder palindromeFinder = new PalindromeFinder();
		System.out.println(palindromeFinder.getCount("cocaagng"));
	}

	private static class PalindromeFinder {


		public boolean isPalin(String input) {
			char[] chars = input.toCharArray();

			for (int i = 0; i < chars.length; i++) {
				if (chars[i] != chars[chars.length - 1 - i]) {
					return false;
				}
			}

			return true;
		}

		public int getCount(String str1) {
			//cocaagng coc aa gng 3
			// onocoderedono ono c o dered ono 5

			if(isPalin(str1)) {
				return 1;
			}

			int start = 0;
			int count = 0;

			for (int i = 0; i < str1.length(); i++) {
				String substring = str1.substring(start, i+1);
				if(isPalin(substring)) {
					System.out.println(substring);
					count ++;
					start = i;
				}
			}

			return count;
		}
	}
}