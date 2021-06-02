package staticprojects;

public class Add {
	private static void sum1(int n1,int n2)
	{
		int res=(n1+n2);
		System.out.println("Sum is:"+res);
	}
	
	private static void sum1(double n1,double n2,double n3)
	{
		double res=(n1+n2);
		System.out.println("Sum is:"+res);
	}


	public static void main(String[] args) {
		Add.sum1(10, 20);
		Add.sum1(10.5, 12.5, 13.5);

	}

}
