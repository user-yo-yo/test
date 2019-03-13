public class Capsule {
	public static void main(String[] args){
		Person taro = new Person("山田太郎",20);

//		F : System.out.println(taro.Name);
//			Personクラスがprivateなので見れない。
//			見るためにgetをつける。
		System.out.println(taro.getName());

//			setを付けるとprivateに上書きできる。
		taro.setName("花田花子");

		System.out.println(taro.getName());

		System.out.println(taro.getAge());

		taro.setAge(30);
		System.out.println(taro.getAge());
	}
}