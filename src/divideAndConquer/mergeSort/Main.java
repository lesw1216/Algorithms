package divideAndConquer.mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.arr = new int[]{27, 10, 12, 20, 25, 13, 15, 22};
        ms.mergesort(1, ms.arr.length);
        System.out.println(Arrays.toString(ms.arr));
    }
}

class MergeSort {
    public int[] arr;


    // 배열을 이진 탐색와 같이 분할 -> 중간값을 구한후 왼쪽 배열과 오른쪽 배열로 나누자
    public void mergesort(int low, int high) {
        int mid;

        // low가 high보다 크다는 것은 배열의 범위가 벗어났음을 알 수 있음
        if (low < high) {
            mid = (low + high) / 2;
            mergesort(low, mid);
            mergesort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        int leftIndex;
        int rightIndex;
        int tmpArrIndex;
        int[] tmpArr = new int[high];

        leftIndex = low;
        rightIndex = mid + 1;
        tmpArrIndex = low;

        while (leftIndex <= mid && rightIndex <= high) {
            /*
                분할한 좌우 배열의 각 요소를 하나씩 비교하여 임시 배열에 작은 값을 넣는 조건식.
                첫번째 조건은 왼쪽 배열에서 선택한 특정 요소가 오른쪽 배열에서 선택한 특정 요소보다 작을 경우
                위에서 만들어 두었던 임시배열에 저장한다.
                그와 반대로 오른쪽 요소가 더 작다면 그 값을 임시 배열에 저장한다.
                이때 저장한 후에 저장한 요소의 원래 인덱스는 더이상 사용하지 않으므로 다음 인덱스를 비교하기위해 증가연산자를 사용한다.
                모든 조건이 수행된후 마지막은 임시배열의 인덱스를 증가시켜준다.
             */
            if (arr[leftIndex - 1] < arr[rightIndex - 1]) {
                tmpArr[tmpArrIndex - 1] = arr[leftIndex - 1];
                leftIndex++;
            } else {
                tmpArr[tmpArrIndex - 1] = arr[rightIndex - 1];
                rightIndex++;
            }
            tmpArrIndex++;
        }

        /*
            위의 while문을 모두 실행 후 종료된다면, 그 이유는 두가지다.
            1. 분할한 좌우 배열 중 왼쪽 배열의 인덱스가 중간값을 넘어갔을 경우
            2. 분할한 좌우 배열 중 오른쪽 배열의 인덱스가 최대값을 넘어 갔을 경우.
            즉, 좌우에 여러 값들이 편향되어 임시 배열 저장되었다면, 인덱스가 넘어가지 않은 배열이 존재할 것이고,
            이 남은 값들을 임시 배열의 다음인덱스부터 마지막인덱스까지 저장한다.
         */

        // 왼쪽 배열 인덱스가 중간값을 넘어섰을 때
        if (leftIndex > mid)
            // 마지막 length에서 착각한 부분 -> 값을 빼는건 맞았지만, +1 더해야 적용이된다. 10 부터 1까지는 10인데 10 - 1 = 9 인것처럼 착각
            System.arraycopy(arr, rightIndex - 1, tmpArr, tmpArrIndex - 1, high - rightIndex + 1);
        // 오른쪽 배열 인덱스가 최대 인덱스를 넘어섰을 때 -> 남은 왼쪽 배열 인덱스를 임시 배열에 남은 위치에 저장한다.
        else
            System.arraycopy(arr, leftIndex - 1, tmpArr, tmpArrIndex - 1, mid - leftIndex + 1);

        // 원래 본 배열에 다시 저장
        System.arraycopy(tmpArr, low - 1, arr, low - 1, high - low + 1);
    }
}
