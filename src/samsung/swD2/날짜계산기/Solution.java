package samsung.swD2.날짜계산기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 월 일로 이루어진 날짜를 2개 입력받아, 두 번째 날짜가 첫 번째 날짜의 며칠째인지 출력하는 프로그램을 작성 <br>
 * 월은 1 ~ 12 <br>
 * 두번째 날짜가 첫번째 날짜보다 항상 커야한다.
 */

public class Solution {
    static int lastDate;

    public static void main(String[] args) throws IOException {
        /*
        입력 한줄에 4개의 수 입력
        같은 월 다른 날짜면 두 번째 월의 날 - 첫 번째 월의 날
        다른 월 일 경우 : (첫 번째 월의 마지막날 - 첫 번째 월의 날)
                      + 두 번째 월의 날(why: 두번째 월은 1일부터 계산, 저번달에서 넘어오니까)
        중간에 여러 월이 껴있을 경우
            다른 월일 경우 계산 방식 + 중간에 껴있는 월들의 마지막 날 총 합
         */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            sb.append("#").append(caseNum).append(" ");
            String[] sLine = bf.readLine().split(" ");

            int[] intLine = new int[sLine.length];
            for (int i = 0; i < sLine.length; i++) {
                intLine[i] = Integer.parseInt(sLine[i]);
            }

            // 같은 월 다른 일 -> 두 번째 월의 날 - 첫 번째 월의 날 + 1
            if (intLine[0] == intLine[2]) {
                sb.append(intLine[3] - intLine[1] + 1).append("\n");
            } else if (intLine[2] - intLine[0] == 1) {
                int firstMonth = intLine[0];
                lastDate = checkLastDate(firstMonth);

                // 연속으로 월일 경우 -> (첫 번째 월의 마지막날 - 첫 번째 월의 날)
                //                    + 두 번째 월의 날(why: 두번째 월은 1일부터 계산, 저번달에서 넘어오니까)
                sb.append((lastDate - intLine[1] + 1) + intLine[3]).append("\n");
            } else if (intLine[2] - intLine[0] > 1){
                // 중간에 여러 월이 껴있는 경우 -> 다른 월일 경우 계산 방식 + 중간에 껴있는 월들의 마지막 날 총 합
                int firstMonth = intLine[0];
                lastDate = checkLastDate(firstMonth);

                int sum = 0;
                for (int i = intLine[0] + 1; i < intLine[2]; i++) {
                    sum += checkLastDate(i);
                }

                sb.append(((lastDate - intLine[1] + 1) + intLine[3]) + sum).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static int checkLastDate(int num) {
        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
            return 31;
        } else if (num == 4 || num == 6 ||  num == 9 || num == 11) {
            return 30;
        } else if (num == 2) {
            return 28;
        }
        return 0;
    }
}
