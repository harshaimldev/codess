import java.util.*;

//bubble sort + nth largest element
public class bsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums={5,2,1,4,3};
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.print(nums[nums.length-n]);

    }
}
