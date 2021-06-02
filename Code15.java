package staticprojects;

public class Code15 {
	
	static void sayhi()
	{
		System.out.println(" hi naresh");
	}
	public static void main(String[] args) 
	{
		Code15 ob=new Code15();
		ob.sayhi();//optional
		
		Code15 .sayhi();
		sayhi();//recomended
		
	}

}
