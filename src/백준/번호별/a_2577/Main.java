package a_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 * 입력
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 *
 * 출력
 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Num num = new Num();
        num.InputNumberOfThree(bf);
        num.printCountOfNumber();
    }
}

class Num {
    private int a;
    private int b;
    private int c;
    private int mul;

    public void InputNumberOfThree(BufferedReader bf) throws IOException {
        a = Integer.parseInt(bf.readLine());
        b = Integer.parseInt(bf.readLine());
        c = Integer.parseInt(bf.readLine());
    }

    public void printCountOfNumber() {
        int[] count = new int[10];
        mul = a * b * c;
        String[] splitArr = String.valueOf(mul).split("");
        for (int i = 0; i < splitArr.length; i++) {
            int s = Integer.parseInt(splitArr[i]);
            count[s] += 1;
        }

//        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count.length; i++)
            System.out.println(count[i]);
//            sb.append(count[i]).append("\n");

//        System.out.println(sb);
    }
}