package Day5;

public class count_sum_digits {

	public static void main(String[] args) {
		long number=54684123456L;
		long sum=0;
		
		
		while(number!=0) {
			long digit=number%10;
			sum+=digit;
			number=number/10;
			
		}
		System.out.println("sum of digit :"+sum);
		

	}

}
