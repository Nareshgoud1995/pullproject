package staticprojects;

public class Addition {
//	step1: data intialize
	private int a;
	private int b;
	
//2.Constructor	
	public  Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	

	//3.bm
	public void sum() {
		int c=a+b;
		System.out.println("sum is"+c);
	}

public static void main(String[] args) {
	
	//4 ob creation
	Addition ob= new Addition(15,10);
	System.out.println(ob);
	Addition ob1= new Addition(15,10);
	System.out.println(ob1);
	
	
	
	//5.calling bm
	ob.sum();
}}
//5 steps