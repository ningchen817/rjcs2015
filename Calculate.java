package cn.edu.tju.nc;

public class Calculate {

	public int sum (int a, int b) {
		int resultSum = a + b;
		return resultSum;
	}
	
	public int sub (int a, int b) {
		int resultSub = a - b;
		return resultSub;
	}

	public double mul(double a, double b) {
		double resultMul = a * b;
		return resultMul;
	}
	
	public double div(double a, double b) {
		double resultDiv = 0;
		if (b != 0)
			resultDiv = a / b;
		else
			resultDiv = 0;
		return resultDiv;
	}
	
	public static void main(String[] args) {
		Calculate cal =  new Calculate();
		System.out.println("加法运算的结果为： " + cal.sum(8, 9));
		System.out.println("减法运算的结果为： " + cal.sub(52, 19));
		System.out.println("乘法运算的结果为： " + cal.mul(3, 7));
		System.out.println("除法运算的结果为： " + cal.div(81, 9));
	}
}
