package dataStructure.재귀.이진탐색;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int result;

        result = bs(arr, 0, arr.length - 1, 7);
        if (result == -1)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 대상의 위치 : " + result);

        result = bs(arr, 0, arr.length - 1, 13);
        if (result == -1)
            System.out.println("탐색 실패");
        else
            System.out.println("탐색 대상의 위치 : " + result);
    }

    /*
    이진 탐색을 재귀로 구현
    반복 패턴
    1. 탐색 범위의 중앙값이 목표값인지 확인
    2. 아니라면, 탐색 범위를 반으로 줄여 다시 탐색 -> 다시 1번으로 이동
    그래서 1 -> 2 -> 1 -> 2 반복

    탈출조건
    1. 탐색 대상을 찾았을 경우
    2. 배열에 탐색 대상이 존재하지 않을경우

    의사코드
    if 첫번째 인덱스가 마지막 인덱스보다 큰 경우
        return -1

    mid = 첫번째 인덱스와 마지막인덱스 사이의 중앙값
    if (mid 번째 요소 값) = 탐색 값
        return mid
    else if (mid 번째 요소 값) < 탐색 값
        return bs(배열, mid+1, 마지막인덱스, 탐색값)
    else
        return bs(배열, first, mid-1, 탐색값)
     */

    public static int bs(int[] arr, int first, int last, int target) {

        // 탈출 조건 1. 배열에 탐색 대상이 존재하지 않을 경우
        if (first > last)
            return -1;

        int mid = (first + last) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid]) // 탈출 조건 2. 중앙 값이 탐색값이 아닐경우 배열을 반으로 잘라 탐색 실행
            return bs(arr, mid + 1, last, target);
        else
            return bs(arr, first, mid - 1, target);
    }
}
