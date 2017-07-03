package ArrayProgram;

import java.util.ArrayList;

public class PrintanArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.forEach((a)->System.out.println(a));

	}

}
