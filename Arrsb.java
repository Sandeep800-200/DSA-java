import java.util.Scanner;

public class Arrsb
{
    public static int[] irr(int n, Scanner sc) {
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
 public static int sub(int[] arr, int n ) {
    int end= 0;
    int start=0;
    for(start=0;start<n;start++){
        for(end = start ; end< n;end++ ){
            for(int k = 0; k <= end; k++ ){
                System.out.print(arr[k] + "  " );
            }
        }
    }

    return 1;
 }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] ar = irr(n, sc);
        sub(ar, n);
 }
}
