package a_2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        NtoOne ntoOne = new NtoOne();
        ntoOne.printNtoOne();
    }
}

class NtoOne {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private int num;

    public void printNtoOne() throws IOException {
        StringBuilder sb = new StringBuilder();
        num = Integer.parseInt(bufferedReader.readLine());
        for (int i = num; i >= 1; i--) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
