package Day6;

public class oddevenarray {

	public static void main(String[] args) {
		int x[]= {1,2,5,6,8,7,9};
		
		for (int i = 0; i < x.length; i++) {
            // Check if the current element is even
            if (x[i] % 2 == 0) {
                System.out.println("Even number: " + x[i]);
            } else {
                System.out.println("Odd number: " + x[i]);
            }
		}

	}

}
