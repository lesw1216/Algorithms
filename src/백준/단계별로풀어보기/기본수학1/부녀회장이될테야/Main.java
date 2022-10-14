package 백준.단계별로풀어보기.기본수학1.부녀회장이될테야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());

            int a = peopleNum(k, n);
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }

    public static int peopleNum(int k, int n) {

        if (n == 1) {
            return 1;
        }

        if (k == 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum++;
            }

            return sum;
        }
        return peopleNum(k, n - 1) + peopleNum(k - 1, n);

    }
}
