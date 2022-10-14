package samsung.swD2.스도쿠검증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(bf.readLine());

        TestCase :
        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            sb.append("#").append(caseNum).append(" ");
            int[][] arr = new int[9][9];

            // 스도쿠 배열에 저장
            for (int i = 0; i < 9; i++) {
                String[] line = bf.readLine().split(" ");

                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }

            // 가로 줄 체크
            for (int i = 0; i < 9; i++) {
                boolean[] checkNum = new boolean[9];
                for (int j = 0; j < 9; j++) {
                    if (checkNum[arr[i][j] - 1]) {
                        // 현재 true 라면 이미 존재하는 값이기 때문에 스도쿠 조건 X
                        sb.append("0" + "\n");
                        continue TestCase;
                    }
                    checkNum[arr[i][j] - 1] = true;
                }
            }

            // 세로 줄 체크
            for (int i = 0; i < 9; i++) {
                boolean[] checkNum = new boolean[9];

                for (int j = 0; j < 9; j++) {
                    if (checkNum[arr[j][i] - 1]) {
                        // 현재 true 라면 이미 존재하는 값이기 때문에 스도쿠 조건 X
                        sb.append("0" + "\n");
                        continue TestCase;
                    }
                    checkNum[arr[j][i] - 1] = true;
                }
            }

            // 9 X 9 체크
            boolean[] checkNumSqrt = new boolean[9];
            int j = 0;
            for (int i = 0; i < 9; i++) {
                for (; j < 9; j++) {
                    if (checkNumSqrt[arr[i][j] - 1]) {
                        sb.append("0" + "\n");
                        continue TestCase;
                    }

                    checkNumSqrt[arr[i][j] - 1] = true;

                    if ((i + 1) % 3 == 0 && (j + 1) % 3 == 0) {
                        Arrays.fill(checkNumSqrt, false);
                        if (j == 8) {
                            j = 0;
                            i += 1;
                            break;
                        }
                        j += 1;
                        i = i - 3;
                        break;
                    }

                    if ((j + 1) % 3 == 0) {
                        j = j - 2;
                        break;
                    }
                }
            }
            sb.append("1" + "\n");
        }
        System.out.println(sb);
    }
}
