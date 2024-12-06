package Day13;

public class static_nonstatic1 {

	public static void main(String[] args) {
		//static method can access static stuff only
		
		System.out.println(static_nonstatic.a);
		static_nonstatic.vishnu();
		
		static_nonstatic sd=new static_nonstatic();
		sd.vardhan();
		//sd.vardhan1();
		

	}

}
