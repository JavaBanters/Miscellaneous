package recursion;

import java.util.Scanner;

//1 * 2 * 3 * 4 * 5
// 5 -> 5 * 4 * 3 * 2 * 1 = 120
// 4 -> 4 * 3 * 2 * 1 = ?
public class FactorialExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial for::");
        int n = sc.nextInt();
        //factorial(n);
        int result = recursiveFactorial(n);
        System.out.println("The factorial via recursion is "+result);
    }

    private static int recursiveFactorial(int n) { // 1
        if(n == 1) return n; // n = 1 return 1
        return recursiveFactorial(n - 1) * n;
    }

    private static void factorial(int n) {
        int result = 1;
//        for(int i = 1 ; i <= n ; i++) {
//            result = result * i;
//        }
        for(int i = n ; i > 0 ; i--) { //n = 5 4
            result = result * i;
        }
        System.out.println(result);
    }

}
