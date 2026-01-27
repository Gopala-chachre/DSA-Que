class TwoSum {

    public static void main(String[] args) {
        int output = twoSum([7,2,11,15], 9);
        System.out.println(output);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int search;
        for(int i = 0; i < nums.length; i++){
            search = target - nums[i];
            if(map.containsKey(search)){
                return new int[]{map.get(search), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}