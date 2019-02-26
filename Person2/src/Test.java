
public class Test {
public static void main(String[]args){

	Person taro = new Person();
	taro.name = "taro";
	taro.age =18;
		System.out.println(taro.name);
		System.out.println(taro.age);

	Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

	System.out.println();
	System.out.println();

	Person sab = new Person("Saburou");
		System.out.println(sab.name);
		System.out.println(sab.age);

	System.out.println();

	Person nana = new Person(25);
		System.out.println(nana.name);
		System.out.println(nana.age);

	System.out.println();

	Person hana = new Person("hanako",17);
		System.out.println(hana.name);
		System.out.println(hana.age);

	System.out.println();
}
}