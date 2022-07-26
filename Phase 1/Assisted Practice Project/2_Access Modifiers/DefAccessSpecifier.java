package AccessModifiers;

class accessSpecifier1 {
	
	void display() 
    { 
        System.out.println("This is defalut access specifier"); 
    } 

}

public class DefAccessSpecifier {
	
	public static void main(String[] args) {
		//default
		accessSpecifier1 obj = new accessSpecifier1(); 		  
        obj.display(); 

	}

}
