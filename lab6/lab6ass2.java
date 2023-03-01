import java.util.*;  
public class lab6ass2 {
    public static void main(String[] args) {
        String fname,lname;
        System.out.println("Enter your first name:");
        System.out.println("Then Enter your last name:");
        Scanner sc = new Scanner(System.in);
         fname = sc.nextLine();
         lname = sc.nextLine();
         System.out.println("Your name is "+lname +" " +fname);
    }
}
