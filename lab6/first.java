import java.util.Scanner; // Importing the scanner file for taking user input

public class first {
    public first() {
    }

    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // System.out.println("Hello");
        // System.out.println("My name is Sorup");

        Scanner scanf = new Scanner(System.in); // Input Object created from Scanner class

        // int a = 123;
        // float b = 3.14f; // after floating no f is required
        // char c = 'a';
        // String d = "string "; // string used for string
        // boolean e = true;
        // System.out.println(a); // ln is used for line break , \n can also be used here
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);

        System.out.println("Enter a string:");
        String name = scanf.nextLine(); // nextLine() for taking string input
        System.out.println("The entered no is:" + name);
        System.out.println("Enter an integer no:");

        int av = scanf.nextInt(); // nextInt() for integer input
        scanf.nextLine();
        System.out.println("The entered no is:" + av);
        System.out.println("Enter your favorite food:");
        String food = scanf.nextLine();
        System.out.println("Your fav food is : " +food);

    }

}
