package innerClass;

abstract class AnonymousInClass 
{	   
	public abstract void display();	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInClass i = new AnonymousInClass() {	         		
			public void display() 
			{	            
				System.out.println("This is Anonymous Inner Class");	         
			}	      
		};	      
		i.display();

	}

}
