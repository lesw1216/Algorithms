package 백준.스택.스택구현하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bf.readLine());
        Stack<Object> stack = new Stack<>();

        for (int i = 0; i < testCase; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);

            if (st.nextToken().equals("push")) {
                Object data = st.nextToken();
                stack.push(data);
                continue;
            }

            if (line.equals("top")) {
                try {
                    Object peek = stack.peek();
                    System.out.println(peek);
                } catch (EmptyStackException e) {
                    System.out.println(-1);
                }
                continue;
            }

            if (line.equals("size")) {
                int size = stack.size();
                System.out.println(size);
                continue;
            }

            if (line.equals("empty")) {
                if (stack.empty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if (line.equals("pop")) {
                try {
                    Object pop = stack.pop();
                    System.out.println(pop);
                } catch (EmptyStackException e) {
                    System.out.println(-1);
                }
            }
        }
    }
}
