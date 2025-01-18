public class RemoveDuplicatesfromSortedArray2 {
    public static int removeDuplicatesfromSortedArray(int[] nums){
        int count = 0;
        for(int n : nums){
            if(count < 2 || n > nums[count-2]){
                nums[count] = n;
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,3,3,4,4,5,5,6,6,6,6};
        int result = removeDuplicatesfromSortedArray(arr);
        System.out.println("Remaining Element Count : "+result);
    }
}
