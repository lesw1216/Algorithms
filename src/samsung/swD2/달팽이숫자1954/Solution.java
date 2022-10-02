package samsung.swD2.달팽이숫자1954;

/*
    달팽이는 1 부터 N * N 까지의 숫자가 시계방향으로 구성
    N = 3 인 경우,
    1 2 3
    8 9 4
    7 6 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            int size = Integer.parseInt(bf.readLine());

            int[][] arr = new int[size][size];

            int num = 1;
            int jStart = 0;
            int iStart = 0;
            int i = 0;
            int j = -1;
            int count = size * size;
            int end = size - 1;
            boolean exit = true;
            while (exit) {
                // 처음 이동
                if (i == iStart) {
                    j++;
                    while (j <= end) {
                        if (num > count) {
                            break;
                        }
                        arr[i][j] = num++;
                        j += 1;
                    }

                    if (num >= count) {
                        break;
                    }

                    j = end;
                }

                iStart++;

                // 오른쪽 이동 후 아래 이동
                if (j == end) {
                    i++;
                    while (i <= end) {
                        arr[i][j] = num++;
                        i += 1;
                    }

                    i = end;
                }



                // 아래로 이동 후 왼쪽으로 이동
                if (i == end) {
                    j--;
                    while (j >= jStart) {
                        arr[i][j] = num++;
                        j -= 1;
                    }
                    j = jStart;
                }

                // 왼쪽으로 이동 후 위로 이동
                if (j == jStart) {
                    i--;
                    while (i >= iStart) {

                        arr[i][j] = num++;
                        i -= 1;
                    }

                    i = iStart;
                }

                jStart++;
                end--;
            }

            sb.append("#").append(caseNum).append("\n");
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    sb.append(anInt).append(" ");
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
}
