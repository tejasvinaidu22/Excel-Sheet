package ExceptionExample;
import java.util.ArrayList;
import java.util.List;

class Test{
	private final List foo;
	
	public Test()
	{
		foo= new ArrayList();
		foo.add("foo"); //Modification-1
	}


//public class KeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new test();
		t.foo.add("bar"); //Modification-2
		System.out.println("print- " + t.foo );

//	}

}
}