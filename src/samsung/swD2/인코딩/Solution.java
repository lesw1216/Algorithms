package samsung.swD2.인코딩;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int decodingBinary = 0;

        // encoding 표
        String[] encoding = new String[]{
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "/"
        };

        ArrayList<String> enArray = new ArrayList<>();

        int testCase = Integer.parseInt(bf.readLine());

        for (int caseNum = 1; caseNum <= testCase; caseNum++) {
            sb2.append("#").append(caseNum).append(" ");
            String[] line = bf.readLine().split("");

            // 입력받은 인코딩된 문자열을 받아 이진수로 변환, 6자리로 변환하는 이유는 인코딩된 문자하나의 크기가 6자리임
            for (String value : line) {
                for (int i = 0; i < encoding.length; i++) {
                    if (encoding[i].equals(value)) {
                        String format = String.format("%06d", Integer.parseInt(Integer.toBinaryString(i)));
                        enArray.add(format);
                    }
                }
            }

            // 이진수로 변환하여 저장한 리스트의 값을 배열로 반환, 이때 6자리 단위로 반환된다.
            // ex> objects[0] = 010001 같이
            Object[] objects = enArray.toArray();
            for (Object object : objects) {
                sb.append(object);
            }

            String[] stringBinary = sb.toString().split("");

            sb.delete(0, sb.length());
            for (int i = 0; i < stringBinary.length; i++) {
                sb.append(stringBinary[i]);
                if ((i + 1) % 8 == 0) {
                    decodingBinary = Integer.parseInt(sb.toString(), 2);
                    sb2.append((char) decodingBinary);
                    sb.delete(0, sb.length());
                }
            }

            enArray.clear();
            sb2.append("\n");
        }

        System.out.println(sb2);
    }
}
