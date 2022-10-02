package samsung.swD3.장애물경주난이도;

/*
    다음 블록이 높으면 올라가고 낮으면 내려간다. 이때
    올라가는 높이와 내려가는 높이 각각이 제일 큰 값들을 난이도라고 한다.

    테스트 케이스 입력 다음 줄에는 직사각형 블록의 개수를 나타내는 정수 N
    그 다음줄에는 N개의 정수가 공백으로 구분되어 입력 -> 직사각형 블록의 높이를 순서대로 나열한 것

    출력은 올라갈때 또는 내려갈 때 가장 큰 높이 변화를 공백으로 나눠 출력
    만약, 블록의 높이가 모두 일정하다면 0을 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int blockNum;
    private static int[] blockHigh;

    private static int upValue;
    private static int downValue;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            blockNum = Integer.parseInt(bf.readLine());
            blockHigh = new int[blockNum];

            upValue = 0;
            downValue = 0;

            String[] line = bf.readLine().split(" ");

            for (int i = 0; i < line.length; i++) {
                blockHigh[i] = Integer.parseInt(line[i]);
            }

            for (int i = 0; i < blockHigh.length - 1; i++) {
                int result = blockHigh[i] - blockHigh[i + 1];

                if (result < 0) {
                    upValue = Math.max(Math.abs(result), upValue);
                } else if (result > 0) {
                    downValue = Math.max(Math.abs(result), downValue);
                } else {
                    upValue = 0;
                    downValue = 0;
                }
            }

            sb.append("#").append(caseNum).append(" ").append(upValue).append(" ").append(downValue).append("\n");
        }

        System.out.println(sb);
    }
}
