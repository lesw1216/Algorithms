package dataStructure.queue;

import java.util.Arrays;

// 원형 큐를 구현
public class CircleQueue {

    // 내부 배열을 final로 선언해도 되지 않을 까?
    private final int[] arr;
    public int capacity = 10;
    private int rear;
    private int front;

    public void queueInit() {
        rear = 0;
        front = 0;
    }

    public CircleQueue() {
        arr = new int[capacity];
    }

    public CircleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
    }

    /*
        큐 삽입
        1. 큐에 데이터가 끝까지 차있는지 검사한다.
        2. 1번 검사 후 비어 있다면 꼬리부분을 가리키는 인덱스위치에 item 삽입
        3. 꼬리 부분 인덱스는 값을 추가했으므로 하나 증가.
     */
    public void enQueue(int item) {
        // 가득차있는지 검사
        if (isFull()) {
            System.out.println("더 이상 추가 할 수 없습니다. => 큐 용량 초과!!");
            return;
        }

        arr[rear] = item;
        rear++;

        // 현재 꼬리가 배열의 마지막 요소 위치일 경우 꼬리를 제일 앞으로 이동
        // MAX는 길이가 아니라 최대 갯수를 저장할 수 있는 값, 즉 length => MAX - 1
        if (rear == capacity)
            rear = 0;
    }

    // 큐에서 삭제
    public Integer deQueue() {
        // 비어있는지 검사
        if (isEmpty()) {
            return null;
        }

        int item = arr[front];
        front++;

        if (front == capacity)
            front = 0;

        return item;
    }

    // 비어 있는 경우
    public boolean isEmpty() {
        return front == rear;
    }

    // 가득 찼을 경우
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    // 조회만
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }

        return arr[front];
    }

    public void allSearch() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        System.out.print(arr[front]);

        /* front > rear 인 경우는 배열 내에
        *  front가 rear보다 뒤에 있는 경우
        * */
        if (front > rear) {
            for (int i = front + 1; i < arr.length; i++)
                System.out.print(", " + arr[i]);

            for (int i = 0; i < rear; i++)
                System.out.print(", " + arr[i]);
        } else {
            for (int i = front + 1; i < rear; i++)
                System.out.print(", " + arr[i]);
        }
        System.out.print("]");
    }
}
