package 백준.단계별로풀어보기.브루트포스.블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int count = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>(count);
        String line2 = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(line2);

        while (st2.hasMoreTokens()) {
            list.add(Integer.valueOf(st2.nextToken()));
        }

        Collections.sort(list);

        int max = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int l = j + 1; l < count; l++) {
                    int sum = list.get(i) + list.get(j) + list.get(l);
                    if (sum > M) {
                        break;
                    }
                    max = Math.max(sum, max);
                }
            }
        }

        System.out.println(max);
    }
}
