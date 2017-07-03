package ArrayProgram;

import java.util.Arrays;
public class Arrayprogram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public String[] increaseArray(String[] theArray,int increaseBy)
		{
			int i = theArray.length;
			int n = ++i;
			String[] newArray = new String[n];
			for(int cnt=0; cnt<theArray.length; cnt++)
			{
				newArray[cnt]= theArray[cnt];
			}
			return newArray;
		}
        System.out.println("Array length =" + cnt);
        System.out.println(theArray);
	}

}
