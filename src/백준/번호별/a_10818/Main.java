package a_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MinMax minMax = new MinMax();
        minMax.printMinMax();
    }
}

class MinMax {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int min;
    int max;

    public void printMinMax() throws IOException {
        int num = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        min = Integer.parseInt(arr[0]);
        max = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (max < Integer.parseInt(arr[i]))
                max = Integer.parseInt(arr[i]);
            else if (min > Integer.parseInt(arr[i]))
                min = Integer.parseInt(arr[i]);
        }

        System.out.println(min + " " + max);
    }
}