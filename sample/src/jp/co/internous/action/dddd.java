package jp.co.internous.action;

public class dddd {
	public static void main(String[] args) {
		 int num1 = 2;
		 int num2 = 3;

		 Calculation calc = new Calculation();
		 Calculation value = calc.calcMethod(num1, num2);

		 System.out.println("足し算：" + value.add);
		 System.out.println("掛け算：" + value.mul);
		 }

		}

		class Calculation {
		 int add;
		 int mul;

		 public Calculation calcMethod(int num1, int num2) {
		 Calculation calc = new Calculation();
		 calc.add = num1 + num2;
		 calc.mul = num1 * num2;

		 return calc;
		 }
}
