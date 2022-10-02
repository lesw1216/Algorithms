package samsung.swD2.어디에단어가들어갈수있을까;

/*
 *  N x N 크디의 단어 퍼즐
 *  입력으로 단어의 퍼즐 모양(흰: 1, 검: 0)
 *  k는 단어의 길이
 *  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int n;
    public static int k;
    private static int rowSum;
    private static int column;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {

            // N, k 입력
            String[] line = bf.readLine().split(" ");
            n = Integer.parseInt(line[0]);
            k = Integer.parseInt(line[1]);
            column = 0;
            rowSum = 0;
            int[] lineArr = new int[n];

            // 가로
            for (int i = 0; i < n; i++) {
                int count = 0;
                String[] rowLine = bf.readLine().split(" ");

                for (int j = 0; j < rowLine.length; j++) {
                    if (rowLine[j].equals("0") && lineArr[j] == k) {
                        System.out.println("column 증가");
                        column++;
                        lineArr[j] = 0;
                    }
                    
                    if (rowLine[j].equals("1")) {
                        count++;
                        lineArr[j] += 1;

                        if (j != rowLine.length - 1) {
                            if (rowLine[j + 1].equals("0") && count == k) {
                                rowSum++;
                            }
                        } else if (count == k){
                            rowSum++;
                        }
                    } else {
                        count = 0;
                        lineArr[j] = 0;
                    }

                    if (i == lineArr.length - 1) {
                        if (lineArr[j] == k) {
                            column++;
                        }
                    }
                }

                System.out.println("n은 " + i);
                for (int i1 : lineArr) {
                    System.out.print("["+ i1 + "]");
                }
                System.out.println();
            } // 가로 end.
            System.out.println("rowSum = " + rowSum);
            System.out.println("column = " + column);
            sb.append("#").append(caseNum).append(" ").append(rowSum + column).append("\n");
        }
        System.out.println(sb);
    }
}
