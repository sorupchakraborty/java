public class lab5ass3 {
    public static void main(String[] args) {
        int a = 89;

        if (a >= 90) {
            System.out.println("grade = O ");
        }

        else if (a < 90 && a >= 80) {
            System.out.println("grade = E");
        }

        else if (a > 80 && a <= 70) {
            System.out.println("grade = A");
        }

        else if (a > 70 && a >= 60) {
            System.out.println("grade = B");
        }

        else if (a > 60 && a >= 50) {
            System.out.println("grade = C");
        }

        else if (a > 50 && a >= 40) {
            System.out.println("grade = D");
        }

        else {
            System.out.println("grade = F ");
        }

    }
}
