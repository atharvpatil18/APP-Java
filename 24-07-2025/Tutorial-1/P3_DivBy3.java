import java.util.Scanner;
public class P3_DivBy3 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else {
            System.out.println("The number is not divisible by 3");
        }
        sc.close();
    }
}
