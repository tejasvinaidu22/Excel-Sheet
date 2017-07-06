package HashSetProgram;

import java.util.HashSet;



public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Banana");
		
		
		hset.add("Apple");
		
		hset.add(null); 
		
		System.out.println(hset);
	}

}
