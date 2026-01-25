import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (!map.containsValue(num[i])){
                map.put(index, num[i]);
                num[index] = map.get(index);
                index++;
            }
        }


        for(int x: num){
            System.out.println(x);
        }

        /*
            int j = nums.length - 1;

            int c = 0;
            for(int i = 1; i <=j;i++ ){
                if(nums[i] != nums[c]){
                    nums[++c] = nums[i];
                }
            }
            return c+1;
        */


    }
}
