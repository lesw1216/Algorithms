package samsung.swD2.twoNumberString;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    private static int n;
    private static int m;
    private static int[] aN;
    private static int[] bM;

    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= testCase; i++) {
            numberSet(bf);
            inputA(bf);
            inputB(bf);
            int max = run();
            System.out.println("#" + i + " " + max);
        }
    }

    public static int run() {
        int max = 0;

        if (n > m) {
            // i는 얼마나 증가되어야 하는가? -> 길이가 작은 m값이 n 마지막 과 같을 경우? 큰 값인 n에서 m을 빼면
            // n = 5, m = 3
            // 0, 1, 2, 3, 4, 5
            // 0, 1, 2
            // i 는 0, 1, 2 / 1, 2, 3 / 2, 3, 4 / 3, 4, 5
            for(int i = 0; i < n - m + 1; i++) {
                int sum = 0;
                /*
                * j는 얼마나 증가되어야하는가? j는 길이가 작은 배열의 피봇? 매번 최대값을 비교하고 다시 들어올때마다
                * j는 i의 값이 된다. 그러나 길이는 변함없다?
                * */
                for(int j = 0; j < m; j++) {
                    sum += aN[i + j] * bM[j];
                }

                max = Math.max(max, sum);
            }
        } else if(n < m) {
            for(int i = 0; i < m - n + 1; i++) {
                int sum = 0;
                for(int j = 0; j < n; j++) {
                    sum += aN[j] * bM[i + j];
                }

                max = Math.max(max, sum);
            }
        } else {
            for (int i = 0; i < n; i++) {
                max += aN[i] * bM[i];
            }
        }

        return max;
    }

    public static void inputA(BufferedReader bf) throws IOException {
        String line = bf.readLine();
        int length = 0;
        StringTokenizer st = new StringTokenizer(line, " ");
        while (st.hasMoreTokens()) {
            aN[length++] = Integer.parseInt(st.nextToken());
        }
    }

    public static void inputB(BufferedReader bf) throws IOException {
        String line = bf.readLine();
        int length = 0;
        StringTokenizer st = new StringTokenizer(line, " ");
        while (st.hasMoreTokens()) {
            bM[length++] = Integer.parseInt(st.nextToken());
        }
    }

    public static void numberSet(BufferedReader bf) throws IOException {
        String[] line = bf.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        aN = new int[n];
        bM = new int[m];
    }
}