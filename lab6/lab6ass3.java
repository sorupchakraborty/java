import java.util.*;

public class lab6ass3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr1[] = new int[100];
        int arr2[] = new int[100];

        int temp = a;
        int j = 0;
        int count1 = 0;
        while (temp != 0) {
            arr1[j++] = temp % 10;
            temp = temp / 10;
            count1++;
        }

        temp = b;
        j = 0;
        int count2 = 0;
        while (temp != 0) {
            arr2[j++] = temp % 10;
            temp = temp / 10;
            count2++;
        }
        for (int i = 0; i < count1; i++) {
            for (int k = 0; k < count2; k++) {
                if (arr1[i] == arr2[k]) {
                    System.out.println("The common digit is: " + arr1[i]);
                }
            }
        }

    }
}
