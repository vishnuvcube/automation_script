package Day7;

public class howmanyduplicatesinarray {

	public static void main(String[] args) {
		int a[]= {15,45,84,96,74,85,96,96,96,84};
		int num=96;
		int count=0;
		
		for(int x:a) {
			if(x==num) {
				count++;
			}
		}
		System.out.println(count);

	}

}
