package arithmeticCalculator;
import java.util.Scanner;

public class ArithmeticCalculator {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator, c;    
		Double number1, number2, result;    
		boolean cont = true;
		Scanner input = new Scanner(System.in);  
		while(cont)
		{
			System.out.println("Choose an operator: +, -, *, or /");   
			operator = input.next().charAt(0);
			System.out.println("Enter first number");  
			number1 = input.nextDouble();   
			System.out.println("Enter second number");  
			number2 = input.nextDouble();  
	
			switch (operator) 
			{  				
			case '+':       
				result = number1 + number2;        
				System.out.println(number1 + " + " + number2 + " = " + result);       
				break;
			case '-':       
				result = number1 - number2;        
				System.out.println(number1 + " - " + number2 + " = " + result);        
				break;
			case '*':       
				result = number1 * number2;       
				System.out.println(number1 + " * " + number2 + " = " + result);      
				break;
			case '/':        
				result = number1 / number2;       
				System.out.println(number1 + " / " + number2 + " = " + result);       
				break;      
			default:       
				System.out.println("Invalid operator!");        
				break;			  
			}	
			System.out.println("Do You Wish To Continue : Y/N");
			c = input.next().charAt(0);
			if(c == 'Y' || c == 'y')
			{
				cont = true;
				System.out.println("\n");				
			}
			else
			{
				cont = false;
			}
		}
		input.close();
  	
	}

}
