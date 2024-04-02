package methodbasic;

public class Main {

    public static void main(String[] args) {

        int a; // declaration
        a = 10; // initialization

        Addition add = new Addition();
        int answer = add.additionWithReturn(10,20);
        System.out.println(answer);


    }

}
