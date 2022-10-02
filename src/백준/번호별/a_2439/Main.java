package a_2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Star star = new Star();
        star.printStar();

    }
}

class Star {
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int num;
    
    public void printStar() throws IOException {
        StringBuilder sb = new StringBuilder();
        num = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= num; i++) {

            for (int k = num; k > i; k--)
                sb.append(" ");

            for (int j = 1; j <= i; j++)
                sb.append("*");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
