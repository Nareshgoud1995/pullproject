package staticprojects;

public class Addition2 {
	
	//setp1: static
 private 	static  void sum(int n1,int n2) {
		int res=n1+n2;
		System.out.println("sum is:"+res);
	}

	public static void main(String[] args) {
  //step2:classname.method
		Addition2 ob=new Addition2();
		ob.sum(25,20);
		
		Addition2.sum(10, 15);
	}

}
