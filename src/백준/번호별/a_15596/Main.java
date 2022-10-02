package a_15596;

public class Main {
    public static void main(String[] args) {

    }


}

class Test {
    private long sum;

    public long sum(int[] a) {
        for (int i : a) {
            sum += i;
        }

        return sum;
    }
}