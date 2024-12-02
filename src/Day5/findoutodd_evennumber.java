package Day5;

public class findoutodd_evennumber {

	public static void main(String[] args) {
		long number =1254687161654651655L;
		long odd=0;
		long even=0;
		
		while(number!=0) {
			long digit=number%10;
			if(digit%2==0) {
				even++;
			}
			else {
				odd++;
			}
			number=number/10;
		}
		System.out.println(odd);
		System.out.println(even);
		
	}
	
}