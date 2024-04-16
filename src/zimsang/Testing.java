package zimsang;


public class Testing {
    static int result = 0;
    public static void main(String[] args) {
        int num = 45678;
        int result = reverseRecursionSimplyfied(num);
        System.out.println(result);
    }

    private static int reverseRecursionSimplyfied(int num) {
        int digits = String.valueOf(num).length();
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if(num%10 == num) return num;
        return (int) (num%10 * Math.pow(10, digits - 1) + helper(num/10, digits-1));
    }


    private static void reverseRecursion(int num) {
        if(num == 0) return;
        int rem = num % 10;
        result = result * 10 + rem;
        reverseRecursion(num/10); //12345  1234 123 12 1 0
    }

    public static void reverse(int num) {
        int result = 0;
        while(num > 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num/10;
        }
        System.out.println(result);
    }


}
