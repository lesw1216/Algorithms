package 백준.단계별로풀어보기.기본수학2.소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(bf.readLine());
        String[] arr;

        arr = bf.readLine().split(" ");

        int count = 0;
        for (String s : arr) {
            int is = Integer.parseInt(s);
            if (is == 2) {
                count++;
            }

            for (int i = 2; i < is; i++) {
                if (is % i == 0) {
                    break;
                }

                if (i == is - 1) {
                    count++;
                }
            }
        }

//        int tempCount = 0;
//        for (int i = 1; i <= 1000; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//
//                if (j == i - 1) {
//                    tempCount++;
//                    System.out.println("소수 = " + i);
//                }
//            }
//        }

        System.out.println(count);
//        System.out.println("tempCount = " + tempCount);
    }
}
