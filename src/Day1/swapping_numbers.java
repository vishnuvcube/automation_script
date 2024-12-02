package Day1;

public class swapping_numbers {

	public static void main(String[] args) {
		int x=50;
		int y=10;
		
		/*if(y==0) {
			y=x;
			x=0;
		}
		else if (x==0) {
			x=y;
			y=0;
		}
		else {
			x=x*y;
			y=x/y;
			x=x/y;
					
					
		}
		
		System.out.println("after swapping the number: "+"x="+x+"y="+y);*/
		
		x=x+y;//60
		y=x-y; // 60-10
		x=x-y;//60-50
		
		System.out.println("after swapping the number:"+"x="+x+"y="+y);
				
	

	}

}
