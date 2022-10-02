package dataStructure.queue;

import java.util.Arrays;

// 원형 큐를 구현
public class Queue {

    private int[] arr;
    public int MAX = 100;
    private int rear;
    private int front;

    public void queueInit() {
        rear = 0;
        front = 0;
    }

    public Queue() {
        arr = new int[MAX];
    }

    public Queue(int capacity) {
        MAX = capacity;
        arr = new int[MAX];
    }

    // 큐 삽입
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
        if (rear == MAX)
            rear = 0;
    }

    // 큐에서 삭제
    public Integer deQueue() {
        // 비어있는지 검사
        if (isEmpty()) {
            System.out.println("더 이상 꺼낼 수 없습니다. => 큐 비어있음!!");
            return null;
        }

        int item = arr[front];
        front++;

        if (front == MAX)
            front = 0;

        return item;
    }

    // 비어 있는 경우
    public boolean isEmpty() {
        return front == rear;
    }

    // 가득 찼을 경우
    public boolean isFull() {
        return (rear + 1) % MAX == front;
    }

    // 조회만
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("큐는 비어있습니다.");
            return null;
        }

        return arr[front];
    }

    public void allSearch() {
        System.out.println(Arrays.toString(arr));
    }
}
