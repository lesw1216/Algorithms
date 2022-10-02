package samsung.swD2.pattern;

/*
    문자열을 입력 받아 마디의 길이를 출력
    마디란 패턴에서 반복되는 부분
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            sb.append("#").append(caseNum).append(" ");
            String line = bf.readLine();

            for (int i = 1; i <= line.length(); i++) {
                String a = line.substring(0, i);
                String b = line.substring(i, i + i);
                /*
                    문자열 b에서 i, i+i 로 나눈 이유, a와 b를 비교할 때 문자열의 길이가 일치해야 하기때문이다.
                    그래서 i + i는 문자열 a가 i 만큼의 길이를 가지므로 문자열 b는 i번째 인덱스 부터 i 만큼의 길이가 필요하다
                 */

                if (a.equals(b)) {
                    sb.append(a.length()).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
