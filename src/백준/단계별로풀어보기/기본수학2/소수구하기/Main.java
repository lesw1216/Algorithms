package 백준.단계별로풀어보기.기본수학2.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            if (i == 1) {
                continue;
            }

            if (i == 2) {
                sb.append(i).append("\n");
                continue;
            }
            // i 가 소수인지 판별, 2 부터 i이전 까지 나누어 0으로 떨어지지 않으면 소수
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

                if (j == i - 1) {
                    sb.append(i).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
