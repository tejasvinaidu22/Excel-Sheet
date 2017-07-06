package HashMapExample;

import java.util;
import java.io;
import java.lang.*;




public class HashMapRetrieveExample {
	
	private static HashMap<Integer, Object[]> data = new HashMap<Integer,Object[]>();
	private static HashMap<Integer, Object[]> screen_data = new HashMap<Integer,Object[]>();
	public final static Object[][] longValues = {{"10", "ABCD", "10.10", "5", "6"}, {"11", "DEFG", "100.100","12.12","4","0"}
	private static String sl,pid,tid,mval,status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		addTask();

	}
	
	public static void addTask()
	{
		for(int k=0; k<longValues.length; k++)
		{
			screen_data.put(k,longValues);
		}
		Set<E> mapSet = (Set) screen_data.entrySet();
		Iterator mapIterator = mapSet.iterator();
		while(mapIterator.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry) mapIterator.next();
			String keyValue = (String) mapEntry.getKey();
			String value = (String) mapEntry.getValue();
			System.out.println(value);
		}
	}

}
