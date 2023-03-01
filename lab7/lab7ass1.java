import java.util.Scanner;

public class lab7ass1 {
    public static void main(String arg[])

    {
        int n;
        int res = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers to calculate avg:");

        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("enter   " + n + "  numbers");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            res = res + a[i];

        System.out.println("average=" + res / n);

    }
}

// import java.util.Scanner;

// class lab7ass1 {

//     public static void main(String data[]) {
//         Scanner inp = new Scanner(System.in);
//         System.out.println("Enter the number of number you want to enter: ");
//         int num = Integer.parseInt(data[0]);

//         int array1[] = new int[100];
//         int sum = 0;

//         for (int i = 1; i <= num; i++) {
//             array1[i] = Integer.parseInt(data[i]);
//             sum = sum + array1[i];
//         }
//         System.out.println("The average is: " + ((float) sum / num));
//     }

// }