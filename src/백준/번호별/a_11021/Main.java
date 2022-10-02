package a_11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Add add = new Add();
        add.setTestCase();
    }
}

class Add {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private int num;

    public void setTestCase() throws IOException {
        StringBuilder sb = new StringBuilder();
        num = Integer.parseInt(bf.readLine());
        inputNum(sb);
    }

    public void inputNum(StringBuilder sb) throws IOException {
        for (int i = 1; i <= num; i++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            sb.append("Case #").append(i).append(":").append(" ").
                    append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        System.out.println(sb);
    }

}
