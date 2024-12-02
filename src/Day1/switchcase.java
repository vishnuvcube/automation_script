package Day1;

public class switchcase {

	public static void main(String[] args) {
		int weeknumber=5;
		
		switch(weeknumber) 
		{
		case 1: System.out.println("monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednessday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		case 7: System.out.println("Sunday"); break;
		default : System.out.println("Invalid date"); // after excetion of the no statement thats why im not added break statement
		
		
		}

	}

}
