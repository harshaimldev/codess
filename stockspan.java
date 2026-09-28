import java.util.*;
public class stockspan {
    public static void main(String[] args){
        int[] n = {100,80,60,70,60,75,85};
        int[] span = new int[n.length];

        stackIMS stack = new stackIMS(n.length);
        for(int i = 0; i < n.length; i++){

            while(!stack.isEmpty() && n[stack.peek()] <= n[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i + 1;
            }
            else{
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
