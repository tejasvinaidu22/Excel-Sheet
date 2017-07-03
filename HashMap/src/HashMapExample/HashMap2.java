package HashMapExample; 

import java.util.*;

public class HashMap2 {
	public static void main(String[] args){
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		
		hm.put(100, "Ashwin");
		hm.put(200, "Sona"); 
		hm.put(300, "Rahul");
		
		for(Map.Entry m:hm.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
