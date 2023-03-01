import java.util.*;

public class lab6ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2;
        float b1, b2;
        System.out.println("Enter two no's for multiplication:(int)");
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        System.out.println("Enter two no's for multiplication:(int)");
        b1 = sc.nextFloat();
        b2 = sc.nextFloat();

        mul obj = new mul();
        obj.multi(b1, b2);
        obj.multi(a1, a2);
    }
}
