package testing1;
import java.util.Scanner;


public class Labs1{//main class


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String name;
	int age;
	double income;
	//create a scanner object to read input 
	Scanner keyboard=new Scanner(System.in);
		//get the user's name
		System.out.println("What is your name?");
		name=keyboard.nextLine();
		//get the user's age
		System.out.println("What's your age:");
		age=keyboard.nextInt();
		//get the income
		System.out.println("What's your income");
		income=keyboard.nextDouble();
	//display the result
	System.out.println("Hello "+name+" your age is "+age+" and the income is $"+income);

	}
	}
