public class besttime {
    public static void main (String[] args){
        int[] nums={7,1,5,3,6,4};
        int n = nums.length;
        int min = nums[0], maxp=0, currp=0;
        for(int i=0;i<n; i++){
            if(min>nums[i]){
                min=nums[i];
            }
            currp = nums[i]-min;
            if(currp>maxp){
                maxp=currp;
            }
        }
        System.out.print(maxp);
    }
}
