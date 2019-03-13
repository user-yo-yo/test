
public class Person {
	public String name = null;
	public int age = 0;

//	①
	public Person(){}

//	②
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

//	③
	public Person(String name){
		this.name = name;
		this.age = 0;
	}

//	④
	public Person(int age){
		this.name = "名前なし";
		this.age = age;
	}

//	⑤
	public Person(int age,String name){
		this.name = name;
		this.age = age;
	}
}
