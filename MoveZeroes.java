import java.util.Scanner;
public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int ZeroIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[ZeroIndex] = nums[i];
                ZeroIndex++;
            }
        }
        for(int i=ZeroIndex; i<nums.length; i++){
            nums[ZeroIndex] = 0;
            ZeroIndex++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
