import java.util.*;

public class lab6ass1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("enter three no:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b & a > c) {
            System.out.println("Greatest is a ="+a);
        }
        else if (b > a & b > c) {
            System.out.println("Greatest is b ="+b );
        }
        else {
            System.out.println("Greatest is c ="+c);
        }
    }
}
