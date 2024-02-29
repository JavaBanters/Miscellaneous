public class RecursionBasic {

    public static void main(String[] args) {
        display();
        System.out.println("end of main");
    }

    private static void display() {
        System.out.println("hello I am from display");
        display1();
        System.out.println("end of display1");
    }

    private static void display1() {
        System.out.println("hello I am from display 1");
        display2();
        System.out.println("end of display2");
    }

    private static void display2() {
        System.out.println("hello I am from display 2");
        display3();
        System.out.println("end of display3");
    }

    private static void display3() {
        System.out.println("hello I am from display 3");
        display4();
        System.out.println("end of display4");
    }

    private static void display4() {
        System.out.println("hello I am from display 4");
    }


}
