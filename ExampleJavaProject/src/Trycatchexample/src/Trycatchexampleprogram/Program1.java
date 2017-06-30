package Trycatchexampleprogram;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		try{
			num1=0;
			num2=62/num1;
			
			System.out.println("Try block message");
			
		}catch(ArithmeticException e){
			
			System.out.println(" \n ");			
			System.out.println("Error: Don't divide a number by zero");
			System.out.println(" \n ");
		}
		
		System.out.println("I'm out of try-catch block in Java");
		
		}
	}


