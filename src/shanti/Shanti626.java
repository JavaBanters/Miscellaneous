package shanti;

public class Shanti626 {
    public static void main(String[] args) {
        int a =20;
        int b = 4;
        System.out.println("Before swapping: a = "+ a +" and b= "+b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swapping: a = "+ a + " and b = "+b);
        Shanti626 st = new Shanti626();
        st.swapNumbers(a,b);
        System.out.println("After swapping: a = "+ a + " and b = "+b);
    }
    public void swapNumbers(int a, int b){
        System.out.println("inside method Before swapping: a = "+ a +" and b= "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("inside method After swapping: a = "+ a + " and b = "+b);

    }

}
