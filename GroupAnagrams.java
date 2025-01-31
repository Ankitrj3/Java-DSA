import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> ValidGroupAnagrams(String str[]){
        if(str.length==0){
            return new ArrayList();
        }

        HashMap<String, List>map = new HashMap<>();

        int count[] = new int[26];

        for(String ank : str){
            Arrays.fill(count,0);
            for(char c: ank.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<26;i++){
                sb.append("#").append(count[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(ank);
        }
        return new ArrayList (map.values());
    }
    public static void main(String args[]){
        String str []= {"ant","bat","vat","tan","tab"};
        System.out.println(ValidGroupAnagrams(str));
    }
}
