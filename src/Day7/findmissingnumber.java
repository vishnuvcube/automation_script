package Day7;

public class findmissingnumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int n=5;
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
		}
		int sum1=(n*(n+1))/2;
		System.out.println("missing element:"+(sum1-sum));

	}

}
