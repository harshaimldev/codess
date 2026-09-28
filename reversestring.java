import java.util.Stack;

public class reversestring {
    public static void main(String [] args){
        String chars = "geek";
        char[] stchar = new char[chars.length()];
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<chars.length(); i++){
            stack.push(chars.charAt(i));
        }
        for(int i=0; i<chars.length(); i++){
            stchar[i] = stack.pop();
        }
        String ch = new String(stchar);
        System.out.println(ch);
    }
}
