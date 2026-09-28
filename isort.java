public class isort {
    public static void main(String[] args){
        int[] nums = {58,49,78,89,12,8,9,90,4,6,8};
        for(int i=0; i<nums.length-1; i++){
            for (int j=i; j>=0; j--){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            }
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
