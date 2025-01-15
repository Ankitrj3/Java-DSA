// import java.util.*;
public class MergeSortedArray {
    public static void MergeArray(int[] arr1, int[] arr2 , int n, int m){
           int i = n-1;
           int j = m-1;
           int k = n+m-1;
    
           while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k] = arr1[i];
                i--;
                k--;
            }else{
                arr1[k] = arr2[j];
                j--;
                k--;
            }
        }
        // for remaining elements in arr2
        while(j>=0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        MergeArray(arr1, arr2, 3, 3);
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }

}