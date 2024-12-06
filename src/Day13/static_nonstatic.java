package Day13;

public class static_nonstatic {
	static int a=10; //static variable
	int b=200; // non-static variable
	
	static void vishnu() {//static variable
		System.out.println("static method");
	}
	
	void vardhan() {
		System.out.println("non-static method");
	}
	void vardhan1() {
		vishnu();
		vardhan();
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		//System.out.println(a);//no need create object because it's object
		static_nonstatic sd=new static_nonstatic();
		
		//System.out.println(sd.b);
		//sd.vardhan();
		sd.vardhan1();
		

	}

}
