package 백준.단계별로풀어보기.기본수학1.분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(bf.readLine());

        long a = 1;
        long b = 1;

        if (num == 1) {
            System.out.println("1/1");
            return;
        }

        boolean right = false; // true 이어야 이동 가능
        boolean down = false;
        boolean rightUp = false;
        boolean leftDown = false;

        for (int i = 1; i < num; i++) {

            if (a == 1 && b == 1) {
                b += 1;
                leftDown = true;
                continue;
            }

            // a == 1이라는 것은 맨 윗 줄 인 상황이다. right가 true면 오른쪽으로 한칸이동
            // 왼쪽 대각선으로 내려가야함 따라서 leftDown = true; right = false;
            if (a == 1 && right) {
                b += 1;
                right = false;
                leftDown = true;
                rightUp = false;
                continue;
            }

            // b == 1 이라는 것은 맨 왼쪽 줄 상황, down이 true면 아래로 한칸이동
            // 오른족 대각선 으로 올라가야함 rightUp = true;
            // leftDown = false;
            if (b == 1 && down) {
                a += 1;
                down = false;
                rightUp = true;
                leftDown = false;
                continue;
            }

            // 왼쪽 대각선 아래로 이동하는 로직
            // a, b 에서 a는 +1, b는 -1
            if (b > 1 && leftDown) {
                a += 1;
                b -= 1;
                if (!down) {
                    down = true;
                }
                continue;
            }

            if (a > 1 && rightUp) {
                a -= 1;
                b += 1;
                if (!right) {
                    right = true;
                }
            }
        }
        System.out.println(a + "/" + b);
    }
}
