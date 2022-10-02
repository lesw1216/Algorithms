package doit자바알고리즘.ch01;

import java.util.Scanner;

public class SumVerbose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        // n이 양수가 입력 될때까지 반복
        // do ~ while은 한번은 무조건 실행된다.
        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
            sum += i;
        }

        System.out.println(sum);
    }
}
