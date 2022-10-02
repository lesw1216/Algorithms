package 백준.단계별로풀어보기.기본수학1.벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(bf.readLine());

        if (num == 1) {
            System.out.println(1);
            return;
        }

        long frontSum = 2;
        long backSum = 7;
        for(int n = 1; ;n++) {
            if (frontSum <= num && num <= backSum) {
                System.out.println(n + 1);
                return;
            }
            else {
                frontSum += 6L * n;
                backSum += 6L * n + 6;
            }
        }
    }
}
