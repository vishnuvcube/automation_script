package Day9;

public class Reverse_String {

	public static void main(String[] args) {
		String actual="Vishnuvardhan";
		String reverse="";
		
		for(int i=actual.length()-1; i>=0; i--) {
			reverse=reverse+actual.charAt(i);
		}
		System.out.println(reverse);

	}

}
