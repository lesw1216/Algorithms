package 백준.단계별로풀어보기.기본수학2.소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        int k = 2;
        while (num != 1) {
            if (num % k == 0) {
                System.out.println(k);
                num /= k;
            } else {
                k++;
            }
        }
    }
}
