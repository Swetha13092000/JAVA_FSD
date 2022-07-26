package map;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap
				
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();      		      
		hashmap.put(1,"Tim");    			      
		hashmap.put(2,"Mary");    			      
		hashmap.put(3,"Catie");   			       			      
		System.out.println("\nThe elements of Hashmap are "); 
		for(Map.Entry<Integer,String> entry : hashmap.entrySet())
		{    			       
			System.out.println(entry.getKey()+" "+entry.getValue());    			      
		}
    			     
		//HashTable
			       			      
		Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();  			      		      
		hashtable.put(4,"Ales");  			      
		hashtable.put(5,"Rosy");  			      
		hashtable.put(6,"Jack");  			      
		hashtable.put(7,"John");  			      
		System.out.println("\nThe elements of HashTable are ");  			      
		for(Map.Entry<Integer,String> n : hashtable.entrySet())
		{    			       
			System.out.println(n.getKey()+" "+n.getValue());    			      
		}		      
			      			      
		//TreeMap
			      			      
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    			      
		map.put(8,"Annie");    			      
		map.put(9,"Carlotte");    			      		
		map.put(10,"Catie");       			      			      
		System.out.println("\nThe elements of TreeMap are ");  			      
		for(Map.Entry<Integer,String> l:map.entrySet())
		{    			       
			System.out.println(l.getKey()+" "+l.getValue());
		}

	}

}
