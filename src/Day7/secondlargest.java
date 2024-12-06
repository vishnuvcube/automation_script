package Day7;

public class secondlargest {

	public static void main(String[] args) {
		int k[]= {12,15,84,11,85,91,100};
		int F_largest=0;
		int S_largest=0;
		
		for(int i=0; i<=k.length-1; i++) {
			if(F_largest<k[i]) {
				S_largest=F_largest;
				F_largest=k[i];
			}else {
				if(k[i]>S_largest){
					S_largest=k[i];
					
					
				}
			}
		}
		System.out.println(S_largest);
		System.out.println(F_largest);

	}

}
