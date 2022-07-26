package methods;

public class MethodDemo {

	public int multipynumbers(int a,int b) 
	{
		int mul=a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo obj=new MethodDemo();
		int ans= obj.multipynumbers(5,10);
		System.out.println("Multipilcation is :"+ans);

	}

}
