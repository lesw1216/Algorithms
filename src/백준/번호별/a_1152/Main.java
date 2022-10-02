package a_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Word word = new Word();
        word.run(new BufferedReader(new InputStreamReader(System.in)));

    }
}

class Word {
    public void run(BufferedReader bf) throws IOException {
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int count = 0;


        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals("")) {
                continue;
            }

            count++;
        }

        System.out.println(count);
    }
}