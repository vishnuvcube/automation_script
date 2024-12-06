package Day12;

public class constructor1 {

    double width, height, depth;

    // Default constructor
    constructor1() {
        width = height = depth = 0;
    }

    // Parameterized constructor
    constructor1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor for cube
    constructor1(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
    
}