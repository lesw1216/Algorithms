package a_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Quiz quiz = new Quiz();
        quiz.inputTestCase(new BufferedReader(new InputStreamReader(System.in)));
    }
}

class Quiz {
    private int count;
    private int[] countArr;

    public void inputTestCase(BufferedReader bf) throws IOException {
        StringBuilder sb = new StringBuilder();
        count = Integer.parseInt(bf.readLine());

        for (int i = 0; i < count; i++) {
            String[] arr = bf.readLine().split("");
            run(arr, sb);
        }

        System.out.println(sb);
    }

    private void run(String[] arr, StringBuilder sb) {

        countArr = new int[arr.length];
        int size = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("X")) {
                countArr[i] = 0;
                size = 1;
                continue;
            }

            countArr[i] = size++;
        }

        for (int i : countArr) {
            sum += i;
        }

        sb.append(sum).append("\n");
    }
}