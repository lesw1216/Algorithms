package dataStructure.재귀.팩토리얼;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 종료하고 싶을 때까지 무한 입력
        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                return;
            }

            int result = Factorial(n);
            System.out.println("n = " + n + "! / 결과 값 = " + result);
        }
    }

    /*
        팩토리얼 값 구하기
        n! = n x n-1 x n-2 x . . . x 2 x 1
        n! = n x (n-1)!
        (n-1)!의 값을 다시 구해야한다
        따라서
        (n-1)! = (n-1) x (n-2)!
        (n-2)! = (n-2) x (n-3)!

        (구하려는 값)! = 구하려는 값 x (구하려는 값 -1)!
        위와 같은 반복 패턴이 만들어 지게됨.

        f(n) -> n x f(n-1) ... n >= 1
                1          ... n = 0    => 종료 조건이 됨.
                n = 0, n = 1 인 경우는 모두 값이 1
        그래서 n >= 1 일 경우
            return n x f(n-1) => 다시 n-1을 팩토리얼 함수에 넣어 재귀 호출
        n == 0 일 경우
            return 1;
     */
    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
