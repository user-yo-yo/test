package jp.co.internous.action;

public class TryBun {
	public static void main(String[] args) {
		int i = 10;
        int j = 3;

        float result = i / j;
        float result2 = (float)i / (float)j;
        int result3 = i/j;

        System.out.println("result = " + result);
        System.out.println("result = " + result2);
        System.out.println("result = " + result3);

        byte a = (byte) 0b10000000;
        System.out.println(a);

        int c = (int) 6L;
//      int c =  6L;  (int型にlong型を入れようとしているのでコンパイルエラー)

        int h = 10;
        System.out.println(h++);
        System.out.println(h);
        System.out.println(h);

        String A = "s";
        String B = "s";
        System.out.println(A==B);
        System.out.println(A.equals(B));

        String Q = "s";
        String W = "ss";
        System.out.println(Q==W);
        System.out.println(Q.equals(W));

            int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//[1]
            for (int index = 0; index < numbers.length; index ++) {//[2]
                System.out.println("[3] number = " + numbers[index]);
            }
        }

}