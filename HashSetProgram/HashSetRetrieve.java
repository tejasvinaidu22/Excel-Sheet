package HashSetProgram;

import java.util.*;

import java.util.HashSet;

public class HashSetRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> newset = new HashSet<String>();
		
	newset.add("Learning");
	newset.add("Simple");
	newset.add("Easy"); 
	
	Iterator iterator = newset.iterator();
	
	while(iterator.hasNext()){
		System.out.println("Value: " + iterator.next()+ " ");
	}
	
	
	}

}
