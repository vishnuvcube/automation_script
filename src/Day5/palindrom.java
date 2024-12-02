package Day5;

public class palindrom {

	public static void main(String[] args) {
		int number=121;
		int reversenumber=0;
		int orginalnumber=number;
		
		while(number>0) {
			int digit=number%10;
			reversenumber=reversenumber*10+digit;
			number=number/10;
		}
		//System.out.println(reversenumber);
		
		if(orginalnumber==reversenumber) {
			System.out.println(orginalnumber);
		}
		else {
			System.out.println(reversenumber);
		}

	}

}
