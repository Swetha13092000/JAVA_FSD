package collection;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating arraylist
		
		System.out.println("ArrayList");
		ArrayList<String> names=new ArrayList<String>();   			      
		names.add("Alex");			      
		names.add("John");    	   		     
		System.out.println(names);  			
				
		//creating vector
			      
		System.out.println("\n");			      
		System.out.println("Vector");			      
		Vector<Integer> vec = new Vector<>();			      
		vec.addElement(20); 			      
		vec.addElement(40); 
		vec.addElement(80); 
		System.out.println(vec);			
				
		//creating linkedlist
		
		System.out.println("\n");		      
		System.out.println("LinkedList");			      
		LinkedList<String> city=new LinkedList<String>();  			      
		city.add("Chennai");  			      
		city.add("Bangalore");  	      			      
		Iterator<String> itr=city.iterator();  			      
		while(itr.hasNext()){         
			System.out.println(itr.next());  
		}	       
			       
		//creating hashset	
		
		System.out.println("\n");			       
		System.out.println("HashSet");			       
		HashSet<Integer> hashset=new HashSet<Integer>();  			       
		hashset.add(14);  			       
		hashset.add(11);  			       
		hashset.add(13);			       
		hashset.add(12);			       
		System.out.println(hashset);
			       
			       
		//creating linkedhashset
			       
		System.out.println("\n");
			       
		System.out.println("LinkedHashSet");			       
		LinkedHashSet<Integer> linhashset=new LinkedHashSet<Integer>();  			       
		linhashset.add(11);  			       
		linhashset.add(13);  			       
		linhashset.add(12);			       
		linhashset.add(14);	       			       
		System.out.println(linhashset);


	}

}
