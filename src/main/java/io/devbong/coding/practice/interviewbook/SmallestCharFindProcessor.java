package io.devbong.coding.practice.interviewbook;

import java.util.*;

public class SmallestCharFindProcessor {

	public static void main(String[] args) {

		SmallestCharFinder smallestCharFinder = new SmallestCharFinder();
		List<Character> characters = smallestCharFinder.find("aaaaabbcccccddde");

		for (Character each : characters) {
			System.out.println(each);
		}
	}

	public static class SmallestCharFinder {

		Map<Character, Integer> appearCountMap = new HashMap();

		public List<Character> find(String target) {

			if (target == null) {
				return Collections.emptyList();
			}

			for (char each : target.toCharArray()) {
				Integer appearCount = appearCountMap.get(Character.valueOf(each));
				if (appearCount == null) {
					appearCountMap.put(each, 1);
				} else {
					appearCountMap.put(each, ++appearCount);
				}
			}

			return getSortedChar();

		}

		private List<Character> getSortedChar() {

			List<Character> characters = new ArrayList(appearCountMap.keySet());
			Collections.sort(characters, new Comparator<Character>() {
				public int compare(Character o1, Character o2) {
					Integer v1 = appearCountMap.get(o1);
					Integer v2 = appearCountMap.get(o2);
					return v1.compareTo(v2);
				}
			});

			return characters.subList(0, 5);
		}
	}
}