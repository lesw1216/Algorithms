package a_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        System.out.println(fibonacci(Integer.parseInt(line)));
    }

    public static int fibonacci(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
