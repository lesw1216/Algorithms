package a_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제<br>
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.<br><br>
 *
 * 입력<br>
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.<br><br>
 *
 * 출력<br>
 * 1부터 n까지 합을 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AddOfN add = new AddOfN();
        add.printAddOfN();
    }
}

class AddOfN {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public void printAddOfN() throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
