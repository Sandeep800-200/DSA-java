import java.util.Scanner;

public class Arrv
{
    public static int[] irr(int n, Scanner sc) {
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

 public static int[] rev(int[] arr, int n)
 {
    int i = 0;
    int j= n -1;
    while(i<j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    
    return(arr);
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = irr(n, sc);
        int[] revp = rev(arr,n);
         System.out.print(" the array before revesing is ");
         for (int i=0; i<arr.length; i++) {
    System.out.print(arr[i] + " ");}

        System.out.print(" the revesed array is ");
     for (int i=0; i<revp.length; i++) {
    System.out.print(revp[i] + " ");}
        
        sc.close();
  }
}
 