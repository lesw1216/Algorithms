package dataStructure.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.deQueue(); // 예상: 경고문 출력
        q.enQueue(10);
        int peek = q.peek();
        System.out.println("peek = " + peek);

        Integer i = q.deQueue();
        System.out.println("i = " + i);

        q.deQueue();
        q.queueInit();

        for (int j = 0; j < 10; j++) {
            q.enQueue(j);
        }

        q.enQueue(10);
        q.allSearch();
    }
}
