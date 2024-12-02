package Day1;

public class largest_two_numbers {

    public static void main(String[] args) {
        int a = 10, b = 15, c = 20;

        if (a + b > b + c && a + b > c + a) {
            System.out.println("a and b are the largest two numbers.");
        } else if (b + c > a + b && b + c > c + a) {
            System.out.println("b and c are the largest two numbers.");
        } else {
            System.out.println("c and a are the largest two numbers.");
        }
    }
}
