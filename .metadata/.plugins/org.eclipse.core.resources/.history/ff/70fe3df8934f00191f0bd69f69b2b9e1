package jp.co.internous.action;

public class Main {
	public static void main(String[] args){
		System.out.println("hello World");
		System.out.println(gokei());
//		①参照
		int total = sum();

		System.out.println(total);
//		②参照

		System.out.println(gokei2(1,3));
	}
	public static int gokei(){
		return 1+1;
//		①returnの値(2)がSystem.out.println(gokei());のgokeiに入る
	}

	public static int sum(){
		return 1+2;
//		②totalという変数に代入させてもできる
//		　returnの値がsumに入り、つまりtotalにもなる。
	}

	public static int gokei2(int a,int b){
		return a + b;
	}
//	③a,bにそれぞれgokei2の1,3を代入し、returnで値をgokei2に戻している。
}
