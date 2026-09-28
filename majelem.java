import java.util.*;
public class majelem {
    public static void main(String[] args){
        int nums[] ={2,2,1,1,1,2,2};
        int n = nums.length;
        int count=0, cand=0;
        for(int i=0; i<n; i++){
            if(count==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                count--;
            }
            else{
                count--;
            }
        }
        System.out.print(cand +" is the majority element");
    }
}
