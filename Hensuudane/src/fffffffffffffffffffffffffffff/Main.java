package fffffffffffffffffffffffffffff;

public class Main {
	public static void main1(String[] args) {
		int a[][] = new int[][] { { 1, 2 }, { 2, 3, 4, } };

		int total = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[i].length; j++) {
				total += a[i][j];
				System.out.println(total);
			}
		}

	}

//	public static void main2(String[] args) {
//		int a[][] = new int[][] { { 1, 2 }, { 2, 3, 4, } };
//
//		int total = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i; j < a[i].length; j++) {
//				total += a[i][j];
//				System.out.println(total);
//			}
//		}
//
//	}
}
