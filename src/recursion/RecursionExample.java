package recursion;

public class RecursionExample {

    public static void main(String[] args) {
        display(1);
    }

    public static void display(int n) {
        if (n == 6) return; // base condition
        System.out.println(n);
        display(n+1);
    }

    

}
