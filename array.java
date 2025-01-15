import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        int n;
        n = ank.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements in array");
            arr[i] = ank.nextInt();
        }
     
        System.out.println(Arrays.toString(arr));// this convert the array in String


        
    }
        
           
}
