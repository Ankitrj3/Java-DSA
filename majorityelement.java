public class majorityelement {
    public static int majorityele(int [] arr){
        int candi = 0;
        int points = 0;

        for(int i=0; i<arr.length; i++){
            if(points == 0){
                candi = arr[i];
            }
            if(candi == arr[i]){
                points++;
            }
            else{
                points--;
            }
        }
        return candi;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityele(arr));

    }
}
