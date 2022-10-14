package samsung.swD2.간단한_소인수분해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N = 2^a * 3^b * 5^c * 7^d * 11^e
 *
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= testCase; i++) {
            int k = 2;
            int[] cnt = new int[5];
            int num = Integer.parseInt(bf.readLine());
            double sqrtNum = Math.sqrt(num);
            sb.append("#").append(i);

            while (k <= sqrtNum && num != 1) {
                if (num % k == 0) {
                    if (k == 2) {
                        cnt[0] += 1;
                    } else if (k == 3) {
                        cnt[1] += 1;
                    } else if (k == 5) {
                        cnt[2] += 1;
                    } else if (k == 7) {
                        cnt[3] += 1;
                    } else if (k == 11) {
                        cnt[4] += 1;
                    }
                    num /= k;
                } else {
                    k++;
                }

            }

            for (int index : cnt) {
                sb.append(" ").append(index);
            }

            if (num > 1) {
                sb.append(num);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
