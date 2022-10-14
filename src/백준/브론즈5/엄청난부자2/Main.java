package 백준.브론즈5.엄청난부자2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        StringTokenizer st = new StringTokenizer(line, " ");
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        BigInteger[] result = n.divideAndRemainder(m);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


}
