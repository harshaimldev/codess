import java.util.*;

public class longesthistogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0; i<n; i++) {
            heights[i] = sc.nextInt();
        }
        int currh=0;
        int max=0;
        stackIMS stack = new stackIMS(n);
        for (int i=0; i<=heights.length; i++){
            if(i==heights.length){
                currh=0;
            }
            else{
                currh= heights[i];
            }
            while(!stack.isEmpty() && heights[stack.peek()]>currh){
                int h = heights[stack.pop()];
                int l=0;
                if(stack.isEmpty()){
                    l=-1;
                }
                else{
                    l = stack.peek();
                }
                int w = i-l-1;
                int currarea = h*w;
                if(currarea>max){
                    max= currarea;
                }
            }
            stack.push(i);
        }
        System.out.println(max);
    }
}
