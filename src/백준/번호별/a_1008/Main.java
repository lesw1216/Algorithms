package a_1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        double A = Double.parseDouble(stringTokenizer.nextToken());
        double B = Double.parseDouble(stringTokenizer.nextToken());

        if (A < 0 || B < 0) {
            return;
        }

        System.out.println(A / B);
    }
}
