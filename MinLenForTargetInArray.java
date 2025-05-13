public class MinLenForTargetInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int t = 7;
        MinLen(nums,t);
    }
    static void MinLen(int[] nums,int k){
        int left = 0;int currSum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while(currSum >= k){
                minLen = Math.min(minLen,right - left + 1);
                currSum -= nums[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) System.out.println("-1");
        else System.out.println(minLen);
    }
}
