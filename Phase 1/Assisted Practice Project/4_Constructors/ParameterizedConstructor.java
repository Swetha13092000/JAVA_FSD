package Constructors;

class Student{
	int id;
	String name;

	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	void display() 
	{
		System.out.println(id+" "+name);
	}

}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student(1,"Alice");
		Student std2=new Student(2,"Bob");
		
		std1.display();
		std2.display();

	}

}
