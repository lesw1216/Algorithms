package a_15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제<br>
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. <br>
 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.<br>
 *
 * <br>C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자.
 * <br>단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
 *
 * <br>Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * <br>BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 *
 * <br>Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다.
 * <br>단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.
 *
 * <br>또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
 * <br>테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
 *
 * <br>자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
 *
 * <br>이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
 *
 * <br><br>입력
 * <br>첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 *
 * <br><br>출력
 * <br>각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
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