package io.devbong.coding.practice.newemployee;

import java.util.ArrayList;
import java.util.List;

public class GoodStringProcessor {

	public static void main(String[] args) {
		GoodString goodString = new GoodString();
		int calCount = goodString.calGoodStringCount("aabbabab", "aaaabbbb");
		System.out.println(calCount);
	}

	private static class GoodString {

		public int calGoodStringCount(String str1, String str2) {

			char[] chars1 = str1.toCharArray();
			char[] chars2 = str2.toCharArray();

			if (chars1.length != chars2.length) {
				return -1;
			}

			List<Integer> pos1 = new ArrayList<Integer>();
			List<Integer> pos2 = new ArrayList<Integer>();

			for (int i = 0; i < chars1.length; i++) {
				if (chars1[i] == 'b') {
					pos1.add(i);
				}

				if (chars2[i] == 'b') {
					pos2.add(i);
				}
			}

			if (pos1.size() != pos2.size()) {
				return -1;
			}

			int count = 0;
			for (int i = 0; i < pos1.size(); i++) {

				int bet = pos1.get(i) - pos2.get(i);

				if (bet < 0) {
					bet *= -1;
				}

				count += bet;
			}

			return count;
		}

	}
}