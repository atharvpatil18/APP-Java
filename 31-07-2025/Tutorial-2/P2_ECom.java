import java.util.Scanner;
public class P2_ECom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total=0;
        int n= sc.nextInt();
        System.out.println("Enter Order values: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        System.out.println("Total: "+total);
        sc.close();
    }
}
