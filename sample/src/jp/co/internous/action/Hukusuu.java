package jp.co.internous.action;

public class Hukusuu {
	public static void main(String[] args){

		int a = 10;
		int b = 10;

		Keisan k = new Keisan();
		Keisan k1 = k.keisanda(a,b);

		System.out.println(k1.h);
		System.out.println(k1.k2);
		System.out.println(k1.w);
	}
}

	class Keisan{
		int h;
		int k2 ;
		int w;
		 public Keisan keisanda(int a,int b){
			 Keisan k = new Keisan();
			 k.h = a-b;
			 k.k2 = a*b;
			 k.w = a/b;

			 return k;
		 }
	}


//	保留。難しい。
//	複数の返り値をまとめるやつをやっているがreturn kがどこに戻るか分からない。
//	mainメソッドに返しているらしい。