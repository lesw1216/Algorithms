package a_2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         int line = Integer.parseInt(bf.readLine());
         printStar(line);
    }

    public static void printStar(int num) {
        if (num == 3) {
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
        } else {
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
            printStar(num / 3);
        }
    }
}
