package Day14;

class A {
	int a=100;
	void method1() {
		System.out.println(a);
	}
}

class B extends A{
	int b=120;
	void method2() {
		System.out.println(b);
	}
}

public class single_inhertance {

	public static void main(String[] args) {
		B obj=new B();
		obj.method2();
		System.out.println(obj.b);
		System.out.println(obj.a);
		
		

	}

}
