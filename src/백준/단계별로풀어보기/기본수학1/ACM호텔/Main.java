package 백준.단계별로풀어보기.기본수학1.ACM호텔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++){
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int column = n / h;
            int row  = n % h;
            if (row == 0) {
                row = h;
            } else {
                column += 1;
            }

            sb.append(row * 100 + column).append("\n");
        }

        System.out.println(sb);
    }
}
