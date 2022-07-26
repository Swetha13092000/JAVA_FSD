package innerClass;

public class MethodLocalInnerClass {

		void display()
		{  
			class Inner
			{  				 
				void msg()
				{					 
					System.out.println("This is Method Local Inner Class");				 
				}  
						  
			}  
			
		  Inner l=new Inner();  
		  l.msg(); 		  		 
		}  

		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MethodLocalInnerClass  obj=new MethodLocalInnerClass();  
			obj.display();			
		}

}


