package Day1;

public class nested_conditions {

	public static void main(String[] args) {
		if(true) {
			if(true) {
				System.out.println("neasted loop");
			}
			else {
				System.out.println("neasted inside else condition");
			}
		}
		else {
			System.out.println("neasted not loop");
		}

	}

}
