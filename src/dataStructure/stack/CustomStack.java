package dataStructure.stack;

public class CustomStack {

    private final int[] stackArr;
    private int capacity = 10;
    private int top = -1;

    // 기본 초기화
    public CustomStack() {
        this.stackArr = new int[capacity];
    }

    // 저장 용량을 직접 설정하여 초기화
    public CustomStack(int capacityInit) {
        this.stackArr = new int[capacity];
        this.capacity = capacityInit;
    }

    /*
        스택에 데이터 삽입(밀어 넣기)
        if top 과 capacity + 1 이 같다면
            오버플로우 메시지 출력
        else
            스택 내부 배열에 top 먼저 증가시킨 후 해당 인덱스에 아이템 저장
     */
    public void push(int item) {
        // 스택이 가득 차있는지 검사
        if (top == capacity) {
            System.out.println("스택이 가득 찼습니다.");
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
        System.out.print("[");
        for (int i = 0; i < top; i++) {
            if (i == 0)
                System.out.print(stackArr[i]);
            else
                System.out.print(", " + stackArr[i]);
        }
        System.out.print("]");
    }

    public void stackInit() {
//        Arrays.fill(stackArr, 0); 사실 상 스택은 모든 값을 꺼낼 필요가 없기 때문에? 물론 기능 추가로는 가능하지만 순수
        // 스택 만 생각해보자.
        // 현재 인덱스를 0으로 설정하면 배열에 저장되어있는 실제 값들은 찾지 못함.
        top = 0;
    }
}
