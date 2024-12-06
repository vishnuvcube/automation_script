package Day7;

public class searchelement1 {

	public static void main(String[] args) {
		int a[]= {12,48,96,74,63,41,58};
		int search_elements=78;
		
		boolean status=false;
		
		for(int x:a) {
			if(x==search_elements) {
				System.out.println("element found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("element not found");
		}

	}

}
