package chuong4;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a= ");
		int a = input.nextInt();
		
		System.out.println("b=");
		int b = input.nextInt();
		
		
		try {
			System.out.println("a / b =" + (float)a /b);
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException" +e.getMessage());
		}

	}
}
