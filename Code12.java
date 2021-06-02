package staticprojects;

public class Code12 {
	void m1() {
		System.out.println("hi");
	}
	static  void m2() {
		m1();
		System.out.println("hello");
	}
	public static void main(String[] args) {
		m2();
	}
}
