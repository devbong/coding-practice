package io.devbong.coding.practice.interviewbook;

public class BoardPagingProcessor {

	public static void main(String[] args) {
		BoardPaging boardPaging = new BoardPaging();
		System.out.println(boardPaging.getTotalPage(10, 1));
		System.out.println(boardPaging.getTotalPage(11, 10));
		System.out.println(boardPaging.getTotalPage(1001, 10));


	}

	public static class BoardPaging {

		public int getTotalPage(int totalCount, int oncePerCount) {
			if (oncePerCount <= 0) {
				throw new IllegalArgumentException();
			}
			return (int) (Math.ceil((double) totalCount / oncePerCount));
		}
	}
}