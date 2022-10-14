package divideAndConquer.binarySearch;

public class Main {
    public static void main(String[] args) {
        IntBinarySearchRecursive bs = new IntBinarySearchRecursive(
                new int[]{3, 5, 7, 11, 23, 29, 34, 43, 54, 89}, 80
        );

        int searchValue = bs.location(0, bs.arr.length - 1);
        if (searchValue == -1) {
            System.out.println("찾는 값 없음");
            return;
        }

        System.out.println("찾는 값의 인덱스: " + searchValue);
    }
}

class IntBinarySearchRecursive {
    public int[] arr;
    public int x;

    public IntBinarySearchRecursive(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    public int location(int low, int high) {
        int mid;

        // 최소 인덱스가 최고 인덱스보다 크다는 것은 모든 요소를 조회 했다는것 -> 종료해야함
        if (low > high)
            return -1;

        mid = (low + high) / 2;

        if (x == arr[mid])
            return mid;
        else if (x < arr[mid])
            return location(low, mid - 1);
        else
            return location(mid + 1, high);
    }
}