package 백준.단계별로풀어보기.문자열.다이얼5622번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int sum = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = bf.readLine().split("");
        bf.close();

        for (String s : line) {
            switch (s) {
                case "A":
                case "B":
                case "C":
                    sum += 3;
                    break;
                case "D":
                case "E":
                case "F":
                    sum += 4;
                    break;
                case "G":
                case "H":
                case "I":
                    sum += 5;
                    break;
                case "J":
                case "K":
                case "L":
                    sum += 6;
                    break;
                case "M":
                case "N":
                case "O":
                    sum += 7;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    sum += 8;
                    break;
                case "T":
                case "U":
                case "V":
                    sum += 9;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    sum += 10;
                    break;
            }

        }
        sb.append(sum).append("\n");
        System.out.println(sb);
    }
}
