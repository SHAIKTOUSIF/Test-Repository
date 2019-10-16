
public class UC1 {

	int i;

	public static void main(String[] args) {
		System.out.println(1);
		UC1 ob=null;
		System.out.println(2);
		try {
			ob.i=10;
			System.out.println(3);
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught the Exception------>   "+e);
		}
		System.out.println(4);
	}

}
