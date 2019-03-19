package jp.co.internous.action;

//「Main.java」というクラス名
public class Main {
	public static void main(String[] args){
		System.out.println("hello world");
		System.out.println(gokei1());
		int total = gokei2();
		System.out.println(total);
	}
	public static int gokei1(){
		return 1+1;
	}
	public static int gokei2(){
		return 100/2;
	}
}
