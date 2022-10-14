package 백준.단계별로풀어보기.기본수학1.달팽이는올라가고싶다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long V = Long.parseLong(st.nextToken());

        long date = (V-B) / (A - B);
        if ((V-B) % (A - B) != 0) {
            date++;
        }

        System.out.println(date);
    }
}
