package Day12;

public class constructor_2 {

	public static void main(String[] args) {
		//Constructor1 k=new Constructor1();
		
		constructor1 box1 = new constructor1(); // Default box
        System.out.println("Volume of box1: " + box1.volume());

        constructor1 box2 = new constructor1(2, 3, 4); // Parameterized box
        System.out.println("Volume of box2: " + box2.volume());

        constructor1 box3 = new constructor1(5); // Cube
        System.out.println("Volume of box3: " + box3.volume());
		
		

	}

}
