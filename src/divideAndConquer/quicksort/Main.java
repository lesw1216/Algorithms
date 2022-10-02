package divideAndConquer.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.arr = new int[]{15, 22, 13, 27, 12, 10, 20, 25};
        qs.quicksort(0, qs.arr.length - 1);
        System.out.println(Arrays.toString(qs.arr));
    }
}

class QuickSort {
    public int[] arr;
    private int pivotPoint;

    public void quicksort(int low, int high) {

        if (high > low) {
            partition(low, high);
            quicksort(low, pivotPoint - 1); // 피봇 기준 왼쪽배열
            quicksort(pivotPoint + 1, high); // 피봇 기준 오른쪽 배열
        }
    }

    private void partition(int low, int high) {
        int i, j;
        int pivotItem, tmp;

        // 피봇으로 첫 원소를 선택, 그러면 첫 원소를 기준으로 분할시작
        // pivotItem 변수에 제일 첫번째 요소를 저장한다.
        // 그래서 arr[low] 요소값이 변경되어도 pivotItem 은 변경 되지 않음.
        pivotItem = arr[low];

        // 초기 기준 원소의 위치는 low 따라서 j에 low를 저장하여 low를 건드리지 않는다.
        j = low;

        // low 보다 하나 큰 값부터 반복 비교 시작함 -> 기준원소가 low의 위치이므로
        for (i = low + 1; i <= high; i++) {

            if (arr[i] < pivotItem) {
                // i번째 요소가 pivotItem(기준원소)보다 작을 경우 => 왼쪽 배열로 이동
                // 그렇다면, 구현을 해보자, 아래와 같다.
                // 현재 i 번째 요소는 기준 원소보다 작은 값을 가리키고 있고,
                // j는 0을 가리키는데 현재 0은 기준원소이므로 j++을 이용하여 다음 요소의 값과 i번째 요소를 교환한다.
                // (이 j를 기준원소를 가리키는 가상피봇인덱스로 봐야할지, 그냥 배열을 순회하는 인덱스로 봐야할지 모르겟다)
                // 아무튼 쭉 수행하다보면 뭔가, 기준원소보다 작은 값들이 계속 왼쪽으로 이동되는 느낌이다.
                j++;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // 위와 같이 한번 모든 요소를 돌게되면 j번째 요소를 기준으로 큰값으로 값이 나뉘게 된다.
        // 그러면, j번째 요소또한 기준원소보다 작은 값이므로 기준원소와 j번째 요소와 위치를 바꾼다.
        // 작은값과 큰값 정확하게 구분되어지고 피봇포인트를 j번째 인덱스로 설정하자.
        // 이제, j를 기준으로 왼쪽배열 오른쪽 배열의 정렬 여부는 모르지만, 확실하게 알 수있는것은 j번째 요소의
        // 위치는 정해지게 되었고, 정렬에 더이상 사용하지 않아도 된다는 것이다.
        // 그래서 위에 quicksort 재귀에서 pivotPoint -1, pivotㅖoint + 1을 하는 이유가 기준원소는 더이상 정렬하지
        // 않아도 된다는 것이다.
        pivotPoint = j;
        tmp = arr[low];
        arr[low] = arr[pivotPoint];
        arr[pivotPoint] = tmp;
    }
}