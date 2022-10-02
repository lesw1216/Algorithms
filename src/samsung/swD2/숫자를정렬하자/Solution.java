package samsung.swD2.숫자를정렬하자;

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
            int length = Integer.parseInt(bf.readLine());

            int[] arr = new int[length];
            String[] line = bf.readLine().split(" ");

            for (int i = 0; i < line.length; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            Arrays.sort(arr);

            sb.append("#").append(caseNum).append(" ");

            for (int j : arr) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
