package staticprojects;

public class Code13 {
	static void m1() {
		System.out.println("hi");


	}
	void m2() {
		m1();

		System.out.println("hello");
	}
	public static void main(String[] args) {
		Code13 ob=new Code13();
		ob.m2();

	}
}
