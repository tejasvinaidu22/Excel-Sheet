package HashMapExample;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.io;
import java.util.lang;

public class HashMapRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		
		hm.put(100, "Ashwin");
		hm.put(200, "Sona");
		hm.put(300, "Rahul");
		
		for(Map.Entry m:hm.entrySet()){
			
			System.out.println(m.getKey()+ " " + m.getValue());
		}  
		
		while(mapIterator.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry) mapIterator.next();
			Integer keyValue = (Integer) mapEntry.getKey(); 
			Object[] value = (Object[]) mapEntry.getValue();
			for(int i=0; i<value.length; i++){
				System.out.println(value[i] + " ");
			}
			System.out.println();
		}
		
		/*String key;
		for(final Iterator iterator = facilities.keySet().iterator; iterator.hasNext();){
			key = iterator.next();
			System.out.println(key + " : " + facilites.get(key));
		}
		
		*/

		
		/*for(Entry<Integer, String> entry : facilities.entrySet()){
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
			*/
		

	}

}
