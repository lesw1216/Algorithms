package a_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A + B를 여러번 출력하는 문제
 *<br>
 * 문제<br>
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.<br><br>
 *
 * 입력<br>
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.<br>
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)<br><br>
 *
 * 출력<br>
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Add add = new Add();
        add.setTestCase();
        add.printAdd();
    }
}

class Add {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder stringBuilder = new StringBuilder();
    private int num;

    public void setTestCase() throws IOException {
        num = Integer.parseInt(bufferedReader.readLine());
    }

    public void printAdd() throws IOException {
        for (int i = 0; i < num; i++) {
            String s = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(a + b).append("\n");
        }

        System.out.println(stringBuilder);
    }
}