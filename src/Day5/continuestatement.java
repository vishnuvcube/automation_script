package Day5;

public class continuestatement {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			/*if(i==5)*/ if(i==5 || i==6 || i==8) {
				continue;
			}
			System.out.println(i);
		}

	}

}
