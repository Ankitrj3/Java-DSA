public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicatesfromSortedArray(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,3,4,4,5,5,6,6};
        int result = removeDuplicatesfromSortedArray(arr);
        System.out.println("Remaining Element Count : "+result);
    }
}
