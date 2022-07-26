package Constructors;

class EmpDetails{
	
	int id;
	String name;
	
	void display() 
	{
		System.out.println(id+" "+name);
	}
	
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails emp1=new EmpDetails();
		EmpDetails emp2=new EmpDetails();

		emp1.display();
		emp2.display();

	}

}
