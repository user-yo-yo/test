package jp.co.internous.action;

public class ChangeToIntAction {

    public static void main(String[] args) throws Exception {

        //String型を宣言
        String str = "2";

        //Stringからintへの変換
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);
    }
}