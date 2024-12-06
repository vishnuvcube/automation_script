package Day7;

public class find_missing_number2 {

	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		int sum=0;
		int n=5;
		
		for(int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
		}
		
		int sum1=(n*(n+1))/2;
		int k=sum1-sum;
		System.out.println(k);
		

	}

}
