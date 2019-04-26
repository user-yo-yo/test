package main;

class ConstructorSample {
    String str1 = "Samurai Engineer";

    //　コンストラクタ
    public ConstructorSample() {
        System.out.println(str1);
    }

    //　引数を持つコンストラクタ
    public ConstructorSample(String str2) {
        System.out.println(str1 + " " + str2);
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {
        //インスタンスの生成
        ConstructorSample cs = new ConstructorSample("blog");
    }

}