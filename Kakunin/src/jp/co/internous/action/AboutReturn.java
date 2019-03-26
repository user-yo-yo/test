package jp.co.internous.action;

public class AboutReturn {
	public static void main(String[] args) {
		 int addNum = add(5, 2);
		 System.out.println("答えは" + addNum + "です。");
		 }

		 private static int add(int num1, int num2) {
		 int addAns = num1 + num2;
		 return addAns;
		 }
	}
