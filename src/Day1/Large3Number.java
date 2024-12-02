package Day1;

public class Large3Number {

	public static void main(String[] args) {
		int a = 10, b= 15, c=25;
		
		
		if(a>b && a>c) {
			System.out.println("A is larger than B & C :"+a);
		}
		else if(b>a && b>c) {
			System.out.println("B is larger than A & C: "+b);
		}
		else {
			System.out.println("C is larger than B & A:  "+c);
		}

	}

}
