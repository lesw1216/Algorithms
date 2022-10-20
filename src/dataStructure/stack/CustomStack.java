package dataStructure.stack;

public class CustomStack<E> {

    private final Object[] stackArr;
    private int capacity = 10;
    private int top = -1;

    // 기본 초기화
    public CustomStack() {
        this.stackArr =  new Object[capacity];
    }

    // 저장 용량을 직접 설정하여 초기화
    public CustomStack(int capacityInit) {
        this.stackArr = new Object[capacity];
        this.capacity = capacityInit;
    }

    /*
        스택에 데이터 삽입(밀어 넣기)
        push(item)
            if top >= capacity -1
                return false;
            else
                top++
                array[top] = item
     */
    public boolean push(E item) {
        // 저장공간 초과
        if (top >= capacity - 1)
            return false;

        stackArr[++top] = item;
        return true;
    }

    /*
        데이터 꺼내기
        pop() {
            if isEmpty()
                return null
            else
                temp = array[top]
                return array[top]
        }
     */
    @SuppressWarnings("unchecked")
    public E pop() {
        // 스택에 데이터가 존재하지 않을 경우
        if (isEmpty())
            return null;

        return (E) stackArr[top--];
    }

    /*
        데이터 확인하기
        peek()
            if isEmpty()
                return null
            else
                array[top]
     */

    @SuppressWarnings("unchecked")
    public E peek() {
        // 스택에 데이터가 존재하지 않을 경우
        if (isEmpty())
            return null;

        return (E) stackArr[top];
    }

    /*
        isEmpty()
            return top < 0;
     */
    public boolean isEmpty() {
        return top < 0;
    }

    public void allSearch() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
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
        top = -1;
    }
}
