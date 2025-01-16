public class ReverseWordInString {
    public static String main(String str){
        String words [] = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(main(str));
    }
}
