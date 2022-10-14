package 백준.단계별로풀어보기.브루트포스.체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);

        // 보드 크기 입력
        int row = Integer.parseInt(st.nextToken());     // 세로
        int column = Integer.parseInt(st.nextToken());  // 가로

        String[][] board = new String[row][column];

        // B, W 입력
        for (int i = 0; i < row; i++) {
            String[] l = bf.readLine().split("");

            for (int j = 0; j < column; j++) {
                board[i][j] = l[j];
            }
        }

        for (int i = 0; i < +7; i++) {

            for (int j = 0; j <= column - 8; j++) {

            }
        }

    }
}
