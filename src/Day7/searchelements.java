package Day7;

public class searchelements {

	public static void main(String[] args) {
		int a[]= {12,48,96,74,63,41,58};
		int search_elements=78;
		
		boolean status=false;
		
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==search_elements) {
				status=true;
				System.out.println("number found");
				break;
			}
		}
		
		if(status==false) {
			System.out.println("number not found");
		}
		
		

	}

}
