package innerClass;

public class NestedInnerClass {
	 
	 class Inner
	 {  
		 
		 void hello()
		 {
			 System.out.println("This is Nested Inner Class");	  		
		 }  
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInnerClass obj = new NestedInnerClass();
		NestedInnerClass.Inner in = obj.new Inner();  
		in.hello();  

	}

}
