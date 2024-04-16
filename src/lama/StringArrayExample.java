package lama;

public class StringArrayExample {

    public static void main(String[] args) {

        String[] strings = {"hello", "dolker", "lama"};
            StringArrayExample sae = new StringArrayExample();
            sae.display(strings);

    }
    public void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
