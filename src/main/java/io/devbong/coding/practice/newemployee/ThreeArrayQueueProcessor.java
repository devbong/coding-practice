package io.devbong.coding.practice.newemployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by coupang on 2016. 12. 13..
 */
public class ThreeArrayQueueProcessor {

	public static void main(String[] args) {
		ThreeArrayQueue threeArrayQueue = new ThreeArrayQueue();
		System.out.println(threeArrayQueue.createThreeArrayQueue(Arrays.asList("a", "b", "c", "d", "e", "f")));
	}

	private static class ThreeArrayQueue {

		public List<String> createThreeArrayQueue(List<String> inputs) {

			List<String> outputs = new ArrayList<String>();
			int count = 0;

			for (int i = 0; i < inputs.size(); i++) {

				outputs.add(String.format("[arr%d %s]", count + 1, inputs.get(i)));

				if (++count == 3) {
					count = 0;
				}
			}

			return outputs;
		}
	}

}
