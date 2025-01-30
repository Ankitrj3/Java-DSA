import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int [] nums){
        //when we used HashSet, we can't use the same element twice
        HashSet<Integer> ank = new HashSet<>();
        for(int x : nums){
            if(ank.contains(x)){
                return true;
            }else{
                ank.add(x);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,1};
        System.out.println(containsDuplicate(nums));
    }
}
