package Day6;

public class twodimensional {

	public static void main(String[] args) {
		int a[][]= { {100,200},
				     {300,400},
				     {500,600},
				     {700,800}
				};
		
		System.out.println("total number of rows: "+a.length);
		System.out.println("total number of columns: "+a[0].length); //first it will goto first row and count column
		System.out.println("extract perticular value:"+a[2][1]);

	}

}
