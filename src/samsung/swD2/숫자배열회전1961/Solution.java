package samsung.swD2.숫자배열회전1961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            int boardSize = Integer.parseInt(bf.readLine());

            // 입력을 저장할 행렬 배열 생성
            String[][] board = new String[boardSize][boardSize];


            for (int i = 0; i < boardSize; i++) {
                String[] line = bf.readLine().split(" ");

                System.arraycopy(line, 0, board[i], 0, boardSize);
            }

            String[][] resultArr = new String[boardSize][3];
            String[][] rotate1 = rotate(board);
            String[] saveArr1 = saveArr(rotate1);

            String[][] rotate2 = rotate(rotate1);
            String[] saveArr2 = saveArr(rotate2);

            String[][] rotate3 = rotate(rotate2);
            String[] saveArr3 = saveArr(rotate3);

            sb.append("#").append(caseNum).append("\n");
            for (int i = 0; i < boardSize; i++) {
                sb.append(saveArr1[i]).append(" ").append(saveArr2[i]).append(" ").append(saveArr3[i]).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static String[] saveArr(String[][] arr) {
        String[] newArr = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]);
            }
            newArr[i] = sb.toString();
            sb.delete(0, sb.length());
        }

        return newArr;
    }

    /*
        90 회전 하는 함수 하나를 만들고
        180도 270도는 2번 3번 회전한 결과
     */
    public static String[][] rotate(String[][] arr) {
        String[][] newArr = new String[arr.length][arr.length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[arr.length - j -1][i];
            }
        }

        return newArr;
    }
}
