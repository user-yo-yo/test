package jp.co.internous.action;

public class WrapperAction {
	public static void main(String args[]) {
        int i_primitive = 10;
//        int → Integer　でもいける。
        System.out.println("基本型：" + Integer.toString(i_primitive));

        Integer i_wrapper = new Integer(-1);
//        数値以外は入れられない(文字を入れると「を変数に解決できません」と出る。
        System.out.println("Integerクラス：" + i_wrapper.toString());
    }

}
