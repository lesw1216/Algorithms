package dataStructure.재귀;

public class RecursiveFunc {
    public static void Recursive(int num) {
        if (num <= 0)
            return;

        System.out.println("Recursive call! " + num);
        Recursive(num - 1);
        System.out.println("현재 num의 값은 : " + num);
    }
    public static void main(String[] args) {
        Recursive(10);
    }
}
