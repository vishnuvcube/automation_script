package Day6;

public class forloopinnerforloop {

	public static void main(String[] args) {
		int a[][]= { 
				 {100,200},
			     {300,400},
			     {500,600},
			     {700,800}
			};
		
		for(int R=0; R<=3; R++) {
			
			for(int C=0; C<=1; C++) {
				System.out.print(a[R][C]+ " ");
			}
			System.out.println();
			
		}

	}

}
