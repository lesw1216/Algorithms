package a_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");

        int y = Integer.parseInt(stringTokenizer.nextToken());
        if (y < 1000 || y > 3000) {
            return;
        }

        System.out.println(y - 543);
    }
}
