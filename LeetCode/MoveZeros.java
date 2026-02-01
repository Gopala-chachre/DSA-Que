class moveZeroes {
    public void moveZeroes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                map.put(index, nums[i]);
                index++;
                nums[i] = 0;
            }
        }
        for(int i = 0; i < map.size(); i++){
            nums[i] = map.get(i);
        }
    }
}