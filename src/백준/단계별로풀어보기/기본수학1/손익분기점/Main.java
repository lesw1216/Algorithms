package 백준.단계별로풀어보기.기본수학1.손익분기점;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        if (C - B > 0) {
            System.out.println((A / (C - B)) + 1);
        } else {
            System.out.println(-1);
        }

    }
}
