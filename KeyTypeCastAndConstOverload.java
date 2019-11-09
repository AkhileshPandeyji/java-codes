package javaBPIT;

import java.util.Scanner;

class ConstructorOverload{
	int a;
	ConstructorOverload(){
		this.a = 20;
		System.out.println("Default Constructor....");
		System.out.println(this.a);
	}
	ConstructorOverload(int a){
		this.a = a;
		System.out.println("Parameterized Constructor....");
		System.out.println(this.a);
	}
	ConstructorOverload(ConstructorOverload c){
		this.a = c.a;
		System.out.println("Copy Constructor....");
		System.out.println(this.a);
	}
}
public class KeyTypeCastAndConstOverload {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Akhilesh Kumar Pandey \t \t 00620802717");
		System.out.println("Taking input from the user.....");
		
		System.out.println("Enter any String.... :");
		String userInput = scanner.nextLine();
		
		System.out.println("Printing input from the user.....");
		System.out.println(userInput);
				
		System.out.println("Performing Different types of Type-casting ......");
		
		System.out.println("Enter any Integer:");
		String intString = scanner.next();
		System.out.println("Casting String to integer using valueOf and parseInt method of Integer class ...");
		int val = Integer.valueOf(intString);
		int val2 = Integer.parseInt(intString);
		
		System.out.println("Casting integers Back to String type ...");
		Integer v = val;
		Integer v2 = val2;
		System.out.println( v.toString()+" "+v2.toString());
		
		System.out.println("Enter any Double:");
		String doubleString = scanner.next();		
		System.out.println("Casting String to double using valueOf and parseDouble method of Double class ...");
		double dval = Double.valueOf(doubleString);
		double dval2 = Double.parseDouble(doubleString);
		
		System.out.println("Casting double Back to String type ...");
		Double dv = dval;
		Double dv2 = dval2;
		System.out.println( dv.toString()+" "+dv2.toString());
		
		
		System.out.println("Performing Constructor Overloading ......");
		@SuppressWarnings("unused")
		ConstructorOverload co1 = new ConstructorOverload();
		ConstructorOverload co2 = new ConstructorOverload(23);
		@SuppressWarnings("unused")
		ConstructorOverload co3 = new ConstructorOverload(co2);
		
	}

}
