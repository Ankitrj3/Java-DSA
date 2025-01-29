public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes1(int[] nums) {
        int maxCount = 0;
        int Currcount = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
               Currcount++;
               maxCount = Math.max(maxCount,Currcount);
            }else{
                Currcount = 0;
            }
        }
        return maxCount;
    }
}
