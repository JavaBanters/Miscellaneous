package recursion;

public class RecursionExample {

    public static void main(String[] args) {
        display(5);
    }

    private static void display(int n) {
        if (n == 0) return; // base condition
        System.out.println("The current number is" +n);
        display(n-1);
        System.out.println("end of :" +n);
    }

    

}
