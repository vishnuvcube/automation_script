package Day5;

public class reversethenumber {

	public static void main(String[] args) {
		int number=4321;
		int reverse=0;
		
		while(number>0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
				
		}
		System.out.println(reverse);
		

	}

}
