package diamondProblem;

interface First 
{  
	
	default void show() 
	{ 
		System.out.println("Default First"); 
	} 
	
} 

interface Second 
{  
	
	default void show() 
	{ 
		System.out.println("Default Second"); 
	} 
	
}  

public class DiamondProblem implements First, Second {

	public void show() 
	{  
		First.super.show(); 
		Second.super.show(); 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondProblem obj = new DiamondProblem(); 
		obj.show(); 
	} 

}


