
public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		int a=10, b=1, c;
		System.out.println(2);
		try {
			c=a/b;
			System.out.println(3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught   " +e);
		}
		System.out.println(4);

	}

}

