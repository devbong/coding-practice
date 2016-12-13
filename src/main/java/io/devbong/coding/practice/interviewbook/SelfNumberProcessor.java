package io.devbong.coding.practice.interviewbook;

import java.util.HashSet;
import java.util.Set;

public class SelfNumberProcessor {

	public static void main(String[] args) {

		Set<Integer> totalNumbers = new HashSet();
		for (int i = 1; i < 5000; i++) {
			totalNumbers.add(Integer.valueOf(i));
		}

		for (int i = 1; i < 5000; i++) {
			int generator = getGenerator(i);
			totalNumbers.remove(generator);
		}

		int sum = 0;
		for (Integer each : totalNumbers) {
			sum += each;
		}

		System.out.println(sum);
	}

	public static int getGenerator(Integer origin) {
		char[] originChars = origin.toString().toCharArray();
		int[] originArr = new int[originChars.length];
		for (int i = 0; i < originArr.length; i++) {
			originArr[i] = Integer.valueOf(originChars[i]);
		}

		int tmp = 0;
		for (int each : originArr) {
			tmp += each;
		}
		tmp += origin;
		return tmp;
	}
}