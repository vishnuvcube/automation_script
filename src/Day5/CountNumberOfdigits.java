package Day5;

public class CountNumberOfdigits {

	public static void main(String[] args) {
		int number=153;
		int count=0;
		
		while(number!=0) {
			number=number/10;
			count++;
			
		}
		System.out.println("number of digits: "+count);

	}

}
