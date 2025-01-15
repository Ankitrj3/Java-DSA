import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    //java is mutable that means we can change the value of array in function 
    // and it will reflect in main function

    // String are imuutable that means we can't change the value of string in function
    // and Array are mutable that means we can change the value of array in function
    static void Change(int arr[]){
        arr[0] = 99;
    }
}
