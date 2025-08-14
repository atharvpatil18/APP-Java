import java.util.Scanner;

public class P1_Account {
    static int[] arr = new int[5];

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Balances: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void Calc() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }
        System.out.println("Total: "+total);
    }

}
