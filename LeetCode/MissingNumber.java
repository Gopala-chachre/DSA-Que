class MissingNumber {
    public int missingNumber(int[] nums) {
        int x = (nums.length)*(nums.length + 1)/2;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return x-sum;
    }
}