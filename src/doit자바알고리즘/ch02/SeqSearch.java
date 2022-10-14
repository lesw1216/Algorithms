package doit자바알고리즘.ch02;

/*
    배열에서의 순차 탐색(= 선형 탐색)
    요소를 순서대로 검색하는 선형 검색은 요소가 정렬되지 않은 배열에서 검색할 때 사용하는 유일한 방법
    종료조건 1. 값을 찾지 못하고 배열 끝까지 탐색한 경우
            2. 값을 찾은 경우

    보통 반환 값을 인덱스를 반환하나?
 */

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearchByFor(arr, arr.length, key);

        if (idx == -1)
            System.out.println("그 값의 요소 없습니다.");
        else
            System.out.println("그 값은 arr[" + idx + "]에 있습니다.");
    }

    static int seqSearchByWhile(int[] a, int n, int key) {
        int i = 0;

        while (true) {

            if (i == n)
                return -1;

            if (a[i] == key)
                return i;

            i++;
        }
    }

    static int seqSearchByFor(int arr[], int num, int key) {
        for (int i = 0; i < num; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }
}
