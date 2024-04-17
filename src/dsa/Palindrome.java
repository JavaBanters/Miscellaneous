package dsa;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Palindrome {

    public static void main(String[] args) {
        System.out.print("Please enter a string: ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.simplePalindrome(inp);
        System.out.println(result);
    }

    private String reverseString(String inp) {
        String rs = "";
        for (int i = 0; i < inp.length(); i++) {
            rs = inp.charAt(i) + rs;
        }
        return rs;
    }

    private boolean simplePalindrome(String inp) {
        return inp.equals(reverseString(inp)) ? true : false;
    }
}
