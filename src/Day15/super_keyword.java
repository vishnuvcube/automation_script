package Day15;

public class super_keyword {
    
    // Base class
    class Animal {
        String color = "block"; // Attribute in the parent class
        void eat() {
        	System.out.println("dog eat meat");
        }
    }

    // Derived class
    class Dog extends Animal {
        String color = "white"; // Attribute in the child class

        void showColors() {
            //System.out.println("Dog color: " + color); // Child class's color
            System.out.println("Animal color: " + super.color); // Parent class's color using super
            
        }
        
        void eat() {
        	//System.out.println("dog eat egg");
        	super.eat();
        }
        
    }

    public static void main(String[] args) {
        super_keyword obj = new super_keyword(); // Create an instance of the outer class
        Dog dog = obj.new Dog(); // Create an instance of the inner class
        dog.showColors(); // Call the method
        dog.eat();
    }
}
