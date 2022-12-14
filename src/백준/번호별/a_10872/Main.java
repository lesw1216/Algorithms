package a_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(bf.readLine())));
    }

    public static int factorial(int num) {
        if (num <= 0)
            return 1;

        return num * factorial(num - 1);
    }
}
