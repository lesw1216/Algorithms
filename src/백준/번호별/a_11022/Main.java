package a_11022;

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
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Add add = new Add();
        add.setTestCase();
        add.printAdd();
    }
}

class Add {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int testCase;

    public void setTestCase() throws IOException {
         testCase = Integer.parseInt(bf.readLine());

    }

    public void printAdd() throws IOException {
        StringBuilder sb = new StringBuilder();
        int a;
        int b;

        for (int i = 1; i <= testCase; i++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b)
                    .append(" = ").append(a + b).append("\n");
        }

        System.out.println(sb);
    }
}
