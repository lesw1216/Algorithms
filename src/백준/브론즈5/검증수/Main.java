package 백준.브론즈5.검증수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");

        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Math.pow(Double.parseDouble(st.nextToken()), 2);
        }

        System.out.println(sum % 10);
    }
}
