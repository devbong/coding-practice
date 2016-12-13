package io.devbong.coding.practice.interviewbook;

import java.util.ArrayList;
import java.util.List;

public class NestedListProcessor {

	public static void main(String[] args) {

		List<Object> arrList1 = new ArrayList<Object>();
		List<Object> arrList2 = new ArrayList<Object>();
		List<Object> arrList3 = new ArrayList<Object>();
		List<Object> nestedList = new ArrayList<Object>();

		arrList1.add(3);
		arrList2.add(arrList1);
		arrList2.add(4);
		arrList3.add(5);
		nestedList.add(1);
		nestedList.add(2);
		nestedList.add(arrList2);
		nestedList.add(arrList3);

		ListFlatter<Integer> listFlatter = new ListFlatter();
		List<Integer> flatList = listFlatter.flat(nestedList);

		for (Integer each : flatList) {
			System.out.println(each);
		}
	}

	public static class ListFlatter<T> {

		private List<T> results = new ArrayList();

		public List<T> flat(List<Object> nestedLists) {
			for (Object each : nestedLists) {
				if (each instanceof List) {
					flat((List) each);
				} else {
					results.add((T) each);
				}
			}
			return results;
		}
	}
}