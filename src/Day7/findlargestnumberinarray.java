package Day7;

public class findlargestnumberinarray {

	public static void main(String[] args) {
		int k[] = {10, 15, 9, 84, 91};
        int firstLargest = 0;

        for (int i = 0; i < k.length; i++) {
            if (firstLargest<k[i]) {
                firstLargest = k[i];
            }
        }

        System.out.println("The largest number in the array is: " + firstLargest);
    }

	}


