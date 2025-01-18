import java.util.Stack;
// 1st way
public class VaildParenthesis {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }else if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

// 2nd way
// public boolean isValid(String s) {// more time consuming
//     while(true){
//         if(s.contains("{}")){
//             s=s.replace("{}","");
//         }else if(s.contains("()")){
//             s=s.replace("()","");
//         }else if(s.contains("[]")){
//             s=s.replace("[]","");
//         }else{
           
//             return s.isEmpty();
//         }
//     }
// }


// 3rd way
// public boolean isValid(String s) {
//     Stack<Character>stack = new Stack<>();
//     for(char c : s.toCharArray()){
//         if(firstChar(c)){
//             stack.push(c);
//         }else{
//             if(stack.size() == 0){
//                 return false;
//             }else{
//                 if(bothChar(stack.peek(),c)){
//                     stack.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//     }
//     return stack.isEmpty();
// }
// private boolean firstChar(char c){
//     if(c == '('){
//         return true;
//     }else if(c == '{'){
//         return true;
//     }else if(c=='['){
//         return true;
//     }else{
//         return false;
//     }
// }
// private boolean bothChar(char c , char d){
//     if(c == '{' && d == '}'){
//         return true;
//     }else if(c == '(' && d == ')'){
//         return true;
//     }else if(c == '[' && d == ']'){
//         return true;
//     }else{
//         return false;
//     }
// }

}
