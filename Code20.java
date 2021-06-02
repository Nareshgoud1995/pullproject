package staticprojects;

public class Code20 {
	
	
	//non-staticvo
	void m1()
	{
		//statements
		System.out.println("chotu");
	}
	//static
	
	static{
	
		System.out.println("anil");	
		}
	
	public static void main(String[] args) {
		
		Code20 ob=new Code20();
		System.out.println("naresh");

		ob.m1();
			}
}
