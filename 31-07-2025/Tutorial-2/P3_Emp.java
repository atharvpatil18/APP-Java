import java.util.Scanner;

public class P3_Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter number of employee: ");
        int n = sc.nextInt();
        System.out.println("Enter salaries: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Highest paid employee: " + max);
        sc.close();
    }
}
