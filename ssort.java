import java.util.*;

public class ssort {
    public static void main(String[] args){
        int[] nums = {12,4,56,68,9,11,77};
        for(int i=0; i<nums.length-1; i++){
            int id = 0;
            int max = nums[0];

            for (int j=1; j<nums.length-i; j++){
                if(nums[j] > max){
                    max = nums[j];
                    id = j;
                }
            }
            nums[id] = nums[nums.length-1-i];
            nums[nums.length-1-i] = max;
        }

        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}