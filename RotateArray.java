public class RotateArray {
    public static void rotateArray(int[]nums , int key){
       int n = nums.length;
       key = key%n;
       reverseNum(nums,0,n-1);
       reverseNum(nums,0,key-1);
       reverseNum(nums,key,n-1);
    }
    public static void reverseNum(int[]nums , int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        int key = 3;
        rotateArray(nums,key);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
