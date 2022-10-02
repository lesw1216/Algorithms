package 백준.스택.단어뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder reversString = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);

            while (st.hasMoreTokens()) {
                Stack<String> stack = new Stack<>();
                String[] s = st.nextToken().split("");
                for (String s1 : s) {
                    stack.push(s1);
                }

                while (!stack.empty()) {
                    reversString.append(stack.pop());
                }

                reversString.append(" ");
            }
            reversString.append("\n");
        }

        System.out.println(reversString);
    }
}
