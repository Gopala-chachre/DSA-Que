public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123; //120 & -123
        double reverse = 0;
        int temp;

        if (num > 0){
            while(num > 0){
                temp = num % 10;
                reverse = temp + reverse * 10;
                num /= 10;
            }
        }
        if (num < 0){
            while(num < 0){
                temp = num % 10;
                reverse = temp + reverse * 10;
                num /= 10;
            }
        }

        temp = (int) reverse;

        if(reverse < Math.pow(-2, 31) || reverse > Math.pow(2, 31)-1){
            System.out.println(0);
        }else {
            System.out.println(temp);
        }
    }
}
