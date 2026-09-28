import java.util.*;

public class lastword {
    public void main (String[] args){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(lastwordlength(str));
    }
    public int lastwordlength(String str){
        int count=0;
        int j=str.length()-1;
        while(str.charAt(j)== ' '){
            j--;
        }
        while(j>=0 && str.charAt(j)!= ' '){
            count++;
            j--;
        }
        return count;
    }
}
