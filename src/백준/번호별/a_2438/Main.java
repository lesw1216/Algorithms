package a_2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Star star = new Star();
        star.printStar();
    }
}

class Star {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int num;

    public void printStar() throws IOException {
        StringBuilder sb = new StringBuilder();
        num = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                sb.append("*");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}