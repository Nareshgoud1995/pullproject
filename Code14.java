package staticprojects;

public class Code14 {
 int x=100;
	 int y=1000;
 void m1(){

	System.out.println( " from non-static method x="+x+"y="+y);
	
}
static void m2() {
	System.out.println("from static method,x="+x+"y="+y);
}
public static void main(String[] args) {
	Code14 ob=new Code14();
	ob.m1();
	Code14.m2();
}


} 