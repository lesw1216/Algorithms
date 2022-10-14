package 백준.단계별로풀어보기.기본수학1.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int dw = Integer.parseInt(bf.readLine());

        if (dw == 4 || dw == 7) {
            System.out.println(-1);
        } else if (dw % 5 == 0) {
            System.out.println(dw / 5);
        } else if (dw % 5 == 1 || dw % 5 == 3) {
            System.out.println((dw / 5) + 1);
        } else if (dw % 5 == 2 || dw % 5 == 4) {
            System.out.println((dw / 5) + 2);
        }
    }
}
