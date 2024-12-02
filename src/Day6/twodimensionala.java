package Day6;

public class twodimensionala {

	public static void main(String[] args) {
		int a[][]= { {100,200},
			     {300,400},
			     {500,600},
			     {700,800}
			};
		
		for(int chr[]:a) {
			for(int x:chr) {
				System.out.print(x+" ");
			}
			System.out.println();
			
		}

	}

}
