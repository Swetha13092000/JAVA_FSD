package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single-dimensional array
		
		int a[]= {10,20,30,40,50};
		System.out.println("Elements of array a\n");
		for(int i=0;i<5;i++) 
		{		
			System.out.print(a[i] +" ");
		}
		System.out.println();

		//multidimensional array
		
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
	      		      
		System.out.println("\nLength of row 1: " + b[0].length);
		System.out.println("\nLength of row 2: " + b[1].length);
		      
	}

}
