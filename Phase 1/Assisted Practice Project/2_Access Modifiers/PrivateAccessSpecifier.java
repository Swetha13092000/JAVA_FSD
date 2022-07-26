package AccessModifiers;

class accessSpecifier2 {
	
	private void display() 
    { 
        System.out.println("This is private access specifier"); 
    } 
	
	void show(){
		display(); //calling private method inside same class
	}

}

public class PrivateAccessSpecifier {

	public static void main(String[] args) {
		//private
		accessSpecifier2  obj = new accessSpecifier2(); 
		obj.show();
        //private methods can be called only inside the same class
	}

}
