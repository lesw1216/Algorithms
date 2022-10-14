package a_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Add add = new Add();
        add.printAdd();
    }
}

class Add {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public void printAdd() throws IOException {
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = bf.readLine();
            if (line == null)
                break;

            String[] arr = line.split(" ");
            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
        }

        System.out.println(sb);
    }
}