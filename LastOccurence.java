class LastOccurence{
    public static int lastOccurence(int arr[] , int target){
        int lastIndex =  -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10,10,10,10,10};
        int target = 10;
        System.out.println(lastOccurence(arr,target));
    }
}