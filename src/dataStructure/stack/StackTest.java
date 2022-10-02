package dataStructure.stack;

public class StackTest {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(6);

        stack.allSearch();

        int pop = stack.pop();
        System.out.println("pop = " + pop);

        int peek = stack.peek();
        System.out.println("peek = " + peek);

        stack.allSearch();

        stack.push(8);

        stack.allSearch();

        peek = stack.peek();
        System.out.println("peek = " + peek);

        pop = stack.pop();
        System.out.println("pop = " + pop);

        peek = stack.peek();
        System.out.println("peek = " + peek);

        stack.allSearch();

        System.out.println("스택 초기화");
        stack.stackInit();
        stack.allSearch();

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        stack.allSearch();
        stack.stackInit();
        stack.allSearch();

        stack.pop();
    }
}
