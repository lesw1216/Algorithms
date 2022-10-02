package a_2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Dice dice = new Dice(a, b, c);
        dice.prizeMoney();
    }
}

class Dice {
    private int a;
    private int b;
    private int c;

    public Dice(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prizeMoney() {
        if (a == b && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b) {
            System.out.println(1000 + a * 100);
        } else if (a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else {
            int max = a;
            int[] arr = {a, b, c};
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }

            System.out.println(max * 100);
        }
    }
}