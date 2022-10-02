package a_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        WordStudy wordStudy = new WordStudy();
        wordStudy.run(new BufferedReader(new InputStreamReader(System.in)));
    }
}

class WordStudy {
    public void run(BufferedReader bf) throws IOException {
        HashMap<String, Integer> lineMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] line = bf.readLine().toUpperCase().split("");

        int max = 0;
        String maxString = "";
        int equal = 0;

        for (String s : line) {

            // 기존에 존재 하면
            if (lineMap.containsKey(s)) {
                lineMap.replace(s, lineMap.get(s) + 1);
                continue;
            }

            // 존재 하지 않을 경우
            lineMap.put(s, 1);
        }

        for (String s : lineMap.keySet()) {
            if (lineMap.get(s) > max) {
                max = lineMap.get(s);
                maxString = s;
            } else if (lineMap.get(s) == max) {
                equal = max;
            }
        }

        if (equal == max) {
            sb.append("?");
            System.out.println(sb);
            return;
        }

        sb.append(maxString);
        System.out.println(sb);
    }
}