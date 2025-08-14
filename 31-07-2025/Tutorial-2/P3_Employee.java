import java.util.Scanner;

public class P3_Employee {
    static int[] arr = new int[5];

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salaries: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void Find_max() {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Highest Salary: "+max);
    }

}
