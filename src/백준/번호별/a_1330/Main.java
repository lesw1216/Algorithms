package a_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.<br><br>
 *
 * 입력<br>
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.<br><br>
 *
 * 출력<br>
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.<br><br>
 *
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.<br><br>
 *
 * 제한
 * -10,000 ≤ A, B ≤ 10,000
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());

        if ((A < -10000 || A > 10000) && (B < -10000 || B > 10000)) {
            return;
        }

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }
    }
}
