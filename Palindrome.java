public class Palindrome {
    public boolean isPalindrome(int x) {
        // int reversed = 0;
        // int original = x;
        // while(x>0){
        //     int digit = x%10;
        //     reversed = reversed*10+digit;
        //     x = x/10;
        // }
        // if(reversed == original){
        //     return true;
        // }else{
        //     return false;
        // }
        String val = String.valueOf(x);
        String rev = new StringBuilder(val).reverse().toString();
        if(rev.equals(val)){
            return true;
        }else{
            return false;
        }
    }
}
