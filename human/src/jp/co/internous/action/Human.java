package jp.co.internous.action;

public class Human {
	public static void main(String[] arg){
		HumanName a = new HumanName();
		System.out.println(a.getName());
		HumanAge b = new HumanAge();
		System.out.println(b.getAge());
		HumanAddress c = new HumanAddress();
		System.out.println(c.getAddress());

	}
}
