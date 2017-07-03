package HashMapExample;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		HashMap newmap = new HashMap();
		
		newmap.put(1, "The first");
		newmap.put(2, "part of a ");
		newmap.put(3, "sentence." );
		
		System.out.println("Map value before a change  " + newmap);
		System.out.println();
		
		String prevvalue=(String)newmap.put(3, "sentence is a noun");
		
		System.out.println("Return the previous value " + prevvalue); 
		
		System.out.println();
		
		System.out.println("The Map value after a change" + newmap);
		

	}

}
