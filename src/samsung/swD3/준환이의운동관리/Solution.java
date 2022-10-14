package samsung.swD3.준환이의운동관리;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    L: 최소 운동 시간
    U: 최대 운동 시간
    L분 이상 U분 이하로 운동해야함

    x분을 이번주에 운동 했을 경우
    최소운동 시간 L 보다 적게 운동했다면 최소 몇분 더 운동해야하는지,
    최대운동 시간 U 보다 넘게 운동했다면 최대 시간보다 더 운동했는지 출력

    최대 운동 시간 초과시 : -1 출력

    입력은 차례로 L U X
 */
public class Solution {
    private static int minTime;
    private static int maxTime;
    private static int activeTime;
    private static int needTime;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            String[] line = bf.readLine().split(" ");

            minTime = Integer.parseInt(line[0]);
            maxTime = Integer.parseInt(line[1]);
            activeTime = Integer.parseInt(line[2]);

            // 운동시간이 최소 운동 시간보다 부족한 경우
            if (activeTime < minTime) {
                needTime = minTime - activeTime;
            } else if (activeTime > maxTime) {
                // 운동 시간 초과
                needTime = -1;
            } else {
                needTime = 0;
            }

            sb.append("#").append(caseNum).append(" ").append(needTime).append("\n");
        }

        System.out.println(sb);
    }
}
