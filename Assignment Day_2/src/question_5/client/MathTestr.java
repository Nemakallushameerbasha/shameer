package question_5.client;

import question_5.tools.Calculator;

public class MathTestr {
	public static void main(String[] args) {
		Calculator calculator=new Calculator(400, 30);
		System.out.println(calculator.add());
		System.out.println(calculator.subtract());
		System.out.println(calculator.multiply());
		
	}


}
