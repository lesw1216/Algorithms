package 백준.단계별로풀어보기.브루트포스.분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        int n = Integer.parseInt(line);


        int result = 0;
        for (int i = 1; i < n; i++) {
            int num = i;
            int sum = 0;

            // 자리 수 더하기
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
