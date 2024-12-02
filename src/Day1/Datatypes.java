package Day1;

public class Datatypes {

	public static void main(String[] args) {
		int i=(int)5.6;
		float j= 6.6f;
		double d=6.555d;
		char h='v';
		
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(d);
//		System.out.println(h);
		
		
		String k = "munikarthik"; // Output should be:m,n,k,r,h,k
        String str = "";
        for (int m = 1; m <= k.length()-1; m++) { // Loop from 1 to k.length() - 1
            if (m % 2 == 0) { // Check if the index is even
                str += k.charAt(m);
              
            }
          
        }
        System.out.println(str);
	}	

}
