package recursion;

public class ReverseNumber {

    static int result = 0;
    public static void main(String[] args) {
        int num = 12345;
        //reverse(num);
        reverseRecursion(num);
        System.out.println(result);
    }

    private static void reverseRecursion(int num) {
        if(num == 0) return;
        int rem = num % 10;
        result = result * 10 + rem;
        reverseRecursion(num/10); // 12345  1234 123 12 1 0
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
