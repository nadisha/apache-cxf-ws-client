package com.example.apache.cxf.calc;

public class App {

	public static void main(String[] args) {
		OperationImplService implService = new OperationImplService();
		Operations calc = implService.getOperationImplPort();
		
		int a = 20, b = 4;
		calc.add(a, b);
		System.out.println(calc.getOutput());
		calc.sub(a, b);
		System.out.println(calc.getOutput());
		calc.div(a, b);
		System.out.println(calc.getOutput());
		calc.multi(a, b);
		System.out.println(calc.getOutput());
	}

}
