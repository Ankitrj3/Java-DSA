import java.util.*;
public class Threesum {
    public static int[] threeSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==target){
                        return new int[]{i,j,k};
                    }
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {12,34,2,3,4,5,6,7,8,9,0};
        int target = 9;
        System.out.print(Arrays.toString(threeSum(arr,target)));
    }
}
