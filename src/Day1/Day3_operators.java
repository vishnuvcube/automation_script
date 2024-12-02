package Day1;

public class Day3_operators {

	public static void main(String[] args) {
		// arthamatic operator +-*/%
		
		int a = 25;
		int b = 15;
		
		//int vishn= a+b;
		
		System.out.println("addition of two numbers :"+(a+b));
		//System.out.println("addition of two numbers :"+vishn);
		System.out.println("difference of two numbers :"+(a-b));
		System.out.println("multification of two numbers :"+(a*b));
		System.out.println("division of two numbers :"+(a/b));
		System.out.println("modulo division of two numbers :"+(a%b));
		
		//relational/comparison operators > >= < <= != ==
		//this operator returns true/false only
		
		int c =70;
		int d=80;
		
		System.out.println(c>d);
		System.out.println(c>=d);
		System.out.println(c<d);
		System.out.println(c<=d);
		System.out.println(c!=d);
		System.out.println(c==d);
		
		boolean res= a==b;
		System.out.println(res);
		
		//3) logical operators && || !
		
		boolean E = true;
		boolean F = false;
		
		System.out.println(E&&F);
		System.out.println(E||F);
		System.out.println(!E);
		System.out.println(!F);
		
		boolean b1=10<=11;
		
		System.out.println(b1);
		
		boolean b2=10<=9;
		System.out.println(b2);
		
		System.out.println(b1&&b2);
		
		System.out.println(b1 || b2);
		
		System.out.println((10<20)&&(100<210));

	}

}
