package 백준.단계별로풀어보기.기본수학2.소수2581번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            if (i == 2) {
                list.add(i);
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

                if (j == i - 1) {
                    list.add(i);
                }
            }
        }

        if (list.size() == 0) {
            System.out.println(-1);
            return;
        }

        int min = list.get(0);
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            sum += temp;
            if (min > temp) {
                min = temp;
            }
        }

        System.out.println(sum);
        System.out.println(min);
    }
}
