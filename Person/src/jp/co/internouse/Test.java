package jp.co.internouse;

public class Test {
	public static void main(String[] args){

		//インスタント化演習
		System.out.println("インスタント化演習");
			System.out.println("");
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-00-0000";
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="111-11-1111";
		Person hana = new Person();
		hana.name="鈴木花子";
		hana.age=16;
		hana.phoneNumber="222-22-2222";
		Person wai = new Person();
		wai.name="名無し";
		wai.age=3;
		wai.phoneNumber="333-33-3333";

		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		taro.talk();
		taro.walk();
		taro.run();
			System.out.println("");
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		jiro.talk();
		jiro.walk();
		jiro.run();
			System.out.println("");
		
		System.out.println(hana.name);
		System.out.println(hana.age);
		System.out.println(hana.phoneNumber);
		hana.talk();
		hana.walk();
		hana.run();
			System.out.println("");
		
		System.out.println(wai.name);
		System.out.println(wai.age);
		System.out.println(wai.phoneNumber);
		wai.talk();
		wai.walk();
		wai.run();

		System.out.println();


		Robot ai= new Robot();
		ai.name="aibo";
		Robot as = new Robot();
		as.name="asimo";
		Robot pe = new Robot();
		pe.name="pepper";
		
		ai.talk();
		ai.walk();
		ai.run();
		as.talk();
		as.walk();
		as.run();
		pe.talk();
		pe.walk();
		pe.run();

	}

}
