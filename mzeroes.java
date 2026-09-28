import java.util.*;

public class mzeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int p1=0;
        for(int p2=0; p2<n; p2++){
            if(nums[p2]==0){
                continue;
            }
            else{
                int temp = nums[p2];
                nums[p2]=nums[p1];
                nums[p1]=temp;
                p1++;
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
