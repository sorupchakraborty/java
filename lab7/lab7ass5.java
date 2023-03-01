import java.util.Scanner;

class Savings_account {
    Scanner inp = new Scanner(System.in);
    static double ins_rt;
    int actno;
    String name;
    double bal;

    static void mod_ins(double a) {
        ins_rt = a;
    }

    void cal_ins() {
        System.out.println("Enter the number of years: ");
        int years = inp.nextInt();
        System.out.println("The ammount is: " + (bal * (1 + ins_rt * years)));
    }

    Savings_account() {
        System.out.println("Enter your name: ");
        name = inp.nextLine();
        System.out.println("Enter your acccount no: ");
        actno = inp.nextInt();
        System.out.println("Enter your balance: ");
        bal = inp.nextDouble();
    }
}

public class lab7ass5 {
    public static void main(String args[]) {
        Savings_account s1 = new Savings_account();
        s1.mod_ins(0.56);
        s1.cal_ins();
    }
}