public class RecursionExample {

    public static void main(String[] args) {
        display(5);
    }

    private static void display(int n) {
        if(n == 0) {
            return;
        }
        display(n-1);
        System.out.println("Hello I am from display");
    }

    

}
