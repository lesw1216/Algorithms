package doit자바알고리즘.ch01;

import java.util.Scanner;

public class Alternative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        System.out.print("n값: ");
        n = sc.nextInt();

        /*
            문제점
            1. 반복시 매번 if문 실행 -> 100번 반복시 100번 if문 실행
            2. i값을 변경하면 for문 전체 수정 필요
         */
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print("+");
            else
                System.out.print("-");
        }
        System.out.println();

        // 해결책
        for (int i = 0; i < n /2; i++)
            System.out.print("+-");

        // n이 홀수일 경우 마지막 홀수번째 +를 출력
        if (n % 2 != 0)
            System.out.print("+");
    }
}
