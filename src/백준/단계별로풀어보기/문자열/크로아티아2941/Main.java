package 백준.단계별로풀어보기.문자열.크로아티아2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        String[] line = bf.readLine().split("");


        for (int i = 0; i < line.length; i++) {

            // 인덱스가 마지막일 경우
            if(i == line.length - 1) {
                count++;
                break;
            }
            String word = line[i];

            // 문자가 c 인 경우,
            if ("c".equals(word)) {
                // 다음 문자 확인
                word = line[i + 1];

                // 다음 문자가 -, = 라면 => 크로아티아 알파벳
                if (word.equals("-") || word.equals("=")) {
                    count++;
                    i++; // 현재문자와 다음 문자가 크로아티아 알파벳이다. 따라서 다음 문자 인덱스를 체크 하지 않도록 넘겨주면
                    // 위에 반복문을 다시 시작할때 다음 문자 인덱스부터 i가 증가한다.
                } else {
                    count++;
                }
            } else if ("s".equals(word) || "z".equals(word)) {
                word = line[i + 1];
                if (word.equals("=")) {
                    count++;
                    i++;
                } else {
                    count++;
                }
            } else if ("n".equals(word) || "l".equals(word)) {
                word = line[i + 1];
                if (word.equals("j")) {
                    count++;
                    i++;
                } else {
                    count++;
                }
            } else if ("d".equals(word)) {
                word = line[i + 1];

                if (word.equals("-")) {
                    count++;
                    i++;
                } else if (word.equals("z")) {
                    if (i >= line.length - 2) {
                        count++;
                        count++;
                        break;
                    }

                    word = line[i + 2];
                    if (word.equals("=")) {
                        count++;
                        i++;
                        i++;
                    } else {
                        // dz는 맞는데 dz=이 아니면?
                        count++;
                    }
                } else {
                    count++;
                }
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
