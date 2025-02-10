public class FindSecondMax {
 

    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return max;
    }
    public static int secondMax(int arr[]){
        int max = max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = max(arr);
        return secondmax;
    }
	public static void main(String[] args) {
	    
	    
	    int arr[] = {12,34,23,54,67};
	    System.out.println(secondMax(arr));
	}
}


