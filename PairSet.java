public class PairSet {
    public static int pairSet(int arr[],int target){
        int pair = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    pair++;
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int arr[] = {3,34,23,4,3,2};
        int target = 5;
        System.out.println(pairSet(arr,target));
    }
}
