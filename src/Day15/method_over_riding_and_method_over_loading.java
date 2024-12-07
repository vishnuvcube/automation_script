package Day15;

class ABC{
	void vishnu(int a) {
		System.out.println(a);
		
	}
	void thirupati(int b) {
		System.out.println(b);
	}
}

class CDF extends ABC{
	void vardhan(int a) {
		System.out.println(a*a);// this over_riding because we are changing implementation
	}
	
	void nani(int x, int y) {// this overloading because we are changing parameters
		System.out.println(x+y);
	}
	
}

public class method_over_riding_and_method_over_loading {

	public static void main(String[] args) {
		CDF cdf = new	CDF();
		cdf.vardhan(10);
		cdf.vardhan(100);
		cdf.nani(15, 20);
		

	}

}
