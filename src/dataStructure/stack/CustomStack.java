package dataStructure.stack;

/*
    pop
    push
    peek
    empty
 */

import java.util.Arrays;

public class CustomStack {

    private final int[] stackArr;
    private int MAX = 100;
    private int top;

    public CustomStack() {
        // 기본 초기화

        this.stackArr = new int[MAX];
        this.top = 0;
    }

    public CustomStack(int capacityInit) {
        // 저장 용량을 직접 설정하여 초기화

        this.stackArr = new int[MAX];
        this.MAX = capacityInit;
        this.top = 0;

    }

    /*
        스택에 데이터 삽입(밀어 넣기)

     */
    public void push(int item) {
        // 스택이 가득 차있는지 검사
        if (top == MAX) {
            System.out.println("스택이 가득 찼습니다.");
            return;
        }

        stackArr[top] = item;
        top++;
    }

    public int pop() {
        if (empty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        }

        return stackArr[--top];
    }

    public int peek() {
        if (empty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        }

        return stackArr[top - 1];
    }

    public boolean empty() {
        return top <= 0;
    }

    public void allSearch() {
        for (int i = 0; i < top; i++) {
            System.out.print(stackArr[i] + " ");
        }
    }

    public void stackInit() {
//        Arrays.fill(stackArr, 0); 사실 상 스택은 모든 값을 꺼낼 필요가 없기 때문에? 물론 기능 추가로는 가능하지만 순수
        // 스택 만 생각해보자.
        // 현재 인덱스를 0으로 설정하면 배열에 저장되어있는 실제 값들은 찾지 못함.
        top = 0;
    }
}
