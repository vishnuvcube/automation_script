package Day14;

class P{
	int a; //we can also add variable in main method 
	void method1() {
		System.out.println("welcome first method....");
	}
}

class Q extends P{
	int b;
	void method2() {
		System.out.println("welcome second method.....");
	}
}

public class multi_inheritance {
	public static void main(String[] args) {
        // Create an object of class B
        Q obj = new Q();
        obj.b=100;
        obj.a=200;
        
        // Access members of class B
        obj.method2(); // Prints value of b
        obj.method1(); // Prints value of a (inherited from class A)

        // Access fields directly
        System.out.println("Accessing field b directly: " + obj.b);
        System.out.println("Accessing field a directly: " + obj.a);
    }
}



	

	    