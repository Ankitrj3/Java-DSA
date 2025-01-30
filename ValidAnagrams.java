public class ValidAnagrams {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int [] anagramArray = new int[26];
        for(int i=0;i<s.length();i++){
            anagramArray[s.charAt(i) - 'a']++;
            anagramArray[t.charAt(i) - 'a']--;
        }
        for(int count : anagramArray){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
