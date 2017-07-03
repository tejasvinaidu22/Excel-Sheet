package ArrayProgram;

import java.util.ArrayList;

public class PrintArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);  
		l.forEach((a)->System.out.println(a));

	}

}
