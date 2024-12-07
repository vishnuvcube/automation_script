package Day14;

class parent{
	void vishnu(int x) {
		System.out.println(x);
	}
}

class child1 extends parent{
	void vardhan(int y) {
		System.out.println(y);
	}
}

class child2 extends parent{
	void thirupati(int z) {
		System.out.println(z);
	}
}


public class hierarchy {

	public static void main(String[] args) {
		child1 M=new child1();
		M.vardhan(10);
		M.vishnu(10);
		child2 U=new child2();
		U.vishnu(56);
		U.thirupati(55);

	}

}
