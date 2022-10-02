package doit자바알고리즘.ch01;

// 3개의 정수값 입력후 중앙값 찾기

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            // a는 b보다 크거가 같다. 이때, c의 값에 따라 중앙값이 바뀐다.
            if (b >= c) {
                // 첫 번째, b가 c보다 크거나 같다면, a >= b >= c의 형태이므로
                // b가 중앙값이 된다.
                return b;
            } else if (a <= c) {
                // 두 번째, a가 c보다 작거나 같다면 c >= a >= b의 형태이므로 a가 중앙값이 된다.
                return a;
            } else
                // 세 번째, a >= b 사이에 c가 있다면 c가 중앙 값이 된다.
                return c;
        } else if (a > c) {
            //a >= b라는 조건이 아니므로 항상 b는 a보다 크다는 것을 생각하자.
            return a;
        } else if (b > c) {
            // 위의 조건들로 인해, a는 b보다 작고 c는 a보다 큼을 알 수 있음.
            // a >= b 성립 안됨 => b > a / a > c 성립 안됨 => c >= a, 따라서 b > a, c >= a인 데,
            // b가 c보다 크다는 조건이 있으므로 b > c > a가 됨
            return c;
        } else{
            // 마지막 위 조건을 성립하지 않으려면 b <= c
            // 따라서 지금까지 조건들 b > a, c >= a c >= b
            // a < b < c
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        int a = sc.nextInt();
        System.out.print("a의 값: ");
        int b = sc.nextInt();
        System.out.print("a의 값: ");
        int c = sc.nextInt();

        System.out.println("중앙 값은 " + med3(a, b, c) + "입니다.");
        System.out.println("med3(3,2,1)의 중앙값은 " + med3(3, 2, 1) + "입니다.");
        System.out.println("med3(3,2,2)의 중앙값은 " + med3(3, 2, 2) + "입니다.");
        System.out.println("med3(3,1,2)의 중앙값은 " + med3(3, 2, 2) + "입니다.");
        System.out.println("med3(3,2,3)의 중앙값은 " + med3(3, 2, 3) + "입니다.");
        System.out.println("med3(2,1,3)의 중앙값은 " + med3(2, 1, 3) + "입니다.");
        System.out.println("med3(3,3,2)의 중앙값은 " + med3(3, 3, 2) + "입니다.");
        System.out.println("med3(3,3,3)의 중앙값은 " + med3(3, 3, 3) + "입니다.");
        System.out.println("med3(2,2,3)의 중앙값은 " + med3(2, 2, 3) + "입니다.");
        System.out.println("med3(2,3,1)의 중앙값은 " + med3(2, 3, 1) + "입니다.");
        System.out.println("med3(2,3,2)의 중앙값은 " + med3(2, 3, 2) + "입니다.");
        System.out.println("med3(1,3,2)의 중앙값은 " + med3(1, 3, 2) + "입니다.");
        System.out.println("med3(2,3,3)의 중앙값은 " + med3(2, 3, 3) + "입니다.");
        System.out.println("med3(1,2,3)의 중앙값은 " + med3(1, 2, 3) + "입니다.");
    }
}
