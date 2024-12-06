package Day12;

public class accountencapsulation {

	public static void main(String[] args) {
		
		encapsulationaccount acc=new encapsulationaccount();
		
		acc.setAccountnumber(125604587);
		acc.setAmount(4562.05);
		acc.setName("Vishnu");
		
		System.out.println(acc.getAccountnumber());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());

		

	}

}
