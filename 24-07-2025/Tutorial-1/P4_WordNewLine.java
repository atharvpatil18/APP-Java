import java.util.Scanner;

public class P4_WordNewLine {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println();
            } else {
                System.out.print(s.charAt(i));
            }
            sc.close();
        }
    }
}
