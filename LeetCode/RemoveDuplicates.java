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


    }
}
