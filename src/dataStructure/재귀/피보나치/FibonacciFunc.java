package dataStructure.재귀.피보나치;

import java.util.Scanner;

public class FibonacciFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n < 0) {
                return;
            }

            System.out.println("입력한 n의 값 = " + n);

            for (int i = 1; i <= n; i++) {
                System.out.print(fib(i) + " ");
            }

            System.out.println();
        }

    }

    /*
    피보나치
    n 번째 값은 n값 앞의 두번째 값과 첫 번째 값의 합
    0 1 2 3 5 8 13 21 34 55 . . .
    따라서 앞의 두개 0 1은 주어진다.

    ** 수열 n번째 값을 구하는 방법 **
    수열 n번째 값 = n의 n-1값(n보다 하나 앞에있는 값) + n의 n-2값(n보다 두개 앞에있는 값)
                = (n-1)         +       (n-2)
              (n-2) + (n-3)         (n-3) + (n-4)
    n-1 값을 알기 위해선 n-1 값도 다시 위의 식처럼 구하여야 한다.
    수열 n번째 값에서 n이 (n-1), (n-2)등등으로 바뀌어 해당 값을 구하게 된다. => 재귀가 발생

    fib(n) => 0  --> n이 1인 경우
              1  --> n이 2인 경우
              fib(n-1) + fib(n-2) --> n의 값이 그외 인경우
    즉, n이 fib()에 전달 되어 함수를 실행 하였을 때, n이 1, 2가 아니면 fib(n-1) + fib(n-2)가 실행되어
    n을 알기위한 사전값들을 찾기위해 재귀함수가 실행되게 된다.

    간단한 의사 코드
        만약 n = 1
            return 0
        만약 n = 2
            return 1
        그외 다른 n
            return fib(n-1) + fib(n-2)
     */
    public static int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}
