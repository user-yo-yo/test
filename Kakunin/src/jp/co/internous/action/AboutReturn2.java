package jp.co.internous.action;

public class AboutReturn2 {
	public static void main(String[] args) {
		 boolean b = divide5(25);
//		 5の倍数以外を入れるとeles("割り切れません。")に行く。
		 if (b) {
		 System.out.println("割り切れます。");
		 } else {
		 System.out.println("割り切れません。");
		 }
		 }

		 private static boolean divide5(int num1) {
		 int ans = num1 % 5;
		 if (ans == 0) {
		 return true;
		 }
		 return false;
		 }
}
