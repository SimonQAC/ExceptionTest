package com.qa.main;
public class Division {
	
	public double divide (int num1, int num2) {
		
		try {
			if (num1 < num2) {
				throw new NumTooBigException();
			}
		}
		catch (NumTooBigException ntbe) {
			System.out.println("num 2 big exception");
			ntbe.printStackTrace();
			return -1;
		}
		
		return num1/num2;
		
	}

}
