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
		System.out.println("�ӷ�����Ľ��Ϊ�� " + cal.sum(8, 9));
		System.out.println("��������Ľ��Ϊ�� " + cal.sub(52, 19));
		System.out.println("�˷�����Ľ��Ϊ�� " + cal.mul(3, 7));
		System.out.println("��������Ľ��Ϊ�� " + cal.div(81, 9));
	}
}
