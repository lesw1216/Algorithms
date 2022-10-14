package a_2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        if (num < 1 || num > 9)
            return;

        MulTable mt = new MulTable(num);
        mt.printMulTable();
    }
}

class MulTable {
    private int num;

    public MulTable(int num) {
        this.num = num;
    }

    public void printMulTable() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.append(num).append(" * ").append(i).append(" = ").append(num*i).append("\n");
//        System.out.println(num + " * " + i + " = " + num * i);
        }

        System.out.println(sb);
    }
}
