package 백준.단계별로풀어보기.문자열.그룹단어체커;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bf.readLine());
        int count = 0;


        for(int i = 0; i < testCase; i++) {
            String[] line = bf.readLine().split("");
            HashMap<String, Boolean> wordMap = new HashMap<String, Boolean>();

            for (int j = 0; j < line.length; j++) {
                String s = line[j];
                // 해시맵에 해당 문자가 있는 지 체크
                if (wordMap.containsKey(s)) {
                    // 있다면
                    // 입력된 문자가 바로 이전 문자와 같지 않다면 이전 문자의 value 값을 false 로 변경
                        if (!line[j-1].equals(s)) {
                            wordMap.put(line[j - 1], false);
                        }
                    // value 가 false 인 경우 바로 탈출
                    if (!wordMap.get(s)) {
                        break;
                    }

                } else {
                    // 없다면 s를 key로 등록하고, value는 true;
                    // 기존에 연속된 단어를 입력중이었다면 value 값을 false 로 변경
                    wordMap.put(s, true);
                    if (j > 0) {
                        wordMap.put(line[j - 1], false);
                    }
                }

                // 여기까지 온다면 그룹단어임으로 카운트 증가
                if (j == line.length - 1){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
