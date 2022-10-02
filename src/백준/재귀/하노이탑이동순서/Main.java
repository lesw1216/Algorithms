package 백준.재귀.하노이탑이동순서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());

        int hanoi = hanoi(num, "1", "2", "3");

        System.out.println(hanoi);
        System.out.println(sb);
    }

    public static int hanoi(int n, String start, String mid, String end) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return 1;
        }

        return hanoi(n - 1, start, end, mid) + hanoi(1, start, mid, end)
                + hanoi(n - 1, mid, start, end);
    }
}
