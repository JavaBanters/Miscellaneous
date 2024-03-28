package recursion;

public class FiboRecursion {
 // 0 1 1 2
    public static void main(String[] args) {
        //System.out.print(fibo(3));
        for(int i = 0 ; i < 6; i++) {
            System.out.print(fibo(i)+ " ");
        }
    }
//5! = 5 * 4 * 3 * 2 * 1
    private static int fibo(int n) {

        if(n == 0) return 0;

        if(n == 1 || n == 2) return 1;

        return fibo(n-1) + fibo(n-2);


    }

}
