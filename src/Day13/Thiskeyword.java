package Day13;

public class Thiskeyword {
	
	int x, y; //class variable/instance variable
	
	Thiskeyword(int x, int y){
		this.x=x;
		this.y=y;
		//System.out.println(x+y);
		
	}
	
	void m() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Thiskeyword k=new Thiskeyword(100,200);
		k.m();

	}

}
