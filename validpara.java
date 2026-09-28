class stack implements smethods{
    char[] arr;
    int top;

    stack(int size){
        this.arr = new char[size];
        this.top=-1;
    }

    @Override
    public void push(char x){
        top++;
        arr[top]=x;
    }

    @Override
    public char pop(){
        char value =arr[top];
        top--;
        return value;
    }

    @Override
    public char peek(){
        return arr[top];
    }

    @Override
    public boolean isEmpty(){
        return (top==-1);
    }
}

interface smethods{
    void push(char x);
    char pop();
    char peek();
    boolean isEmpty();
}
public class validpara {
    public static void main(String[] args){
        String str = "()[]{}";
        stack stack1 = new stack(6);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack1.push(str.charAt(i));}
            else{
                if(stack1.isEmpty()){
                    System.out.println(false);
                }
                else{
                     char top = stack1.pop();
                     if(ch == ')' && top != '(' || ch ==']' && top!='[' || ch=='}' && top!='{'){
                         System.out.println(false);
                     }
                }
            }
        }
        System.out.println(stack1.isEmpty());

    }
}
