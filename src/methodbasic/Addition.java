package methodbasic;

public class Addition {

    public void additionNoReturn(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public int additionWithReturn(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
