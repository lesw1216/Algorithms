package doit자바알고리즘.ch01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = sc.nextInt();

        System.out.print("b의 값 : ");
        int b = sc.nextInt();

        System.out.print("c의 값 : ");
        int c = sc.nextInt();

        // a, b, c의 최댓값을 구하여 max에 대입
        // a를 max라고 가정후 나머지 b, c와 비교
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("최대값은 " + max + "입니다.");
    }
}
