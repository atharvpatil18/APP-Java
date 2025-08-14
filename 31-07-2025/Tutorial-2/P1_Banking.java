import java.util.Scanner;

public class P1_Banking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        n = sc.nextInt();
        System.out.println("Enter the Balances: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}
