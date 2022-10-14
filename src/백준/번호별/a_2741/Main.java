package a_2741;

import java.io.*;

/**
 * 문제
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * 출력
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OneToN oneToN = new OneToN();
        oneToN.printToN();
    }
}

class OneToN {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int num;

    public void printToN() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= num; i++) {
//            bufferedWriter.write(i + "\n");
            stringBuilder.append(i).append("\n");
        }

        System.out.println(stringBuilder);

//        bufferedWriter.flush();
//        bufferedWriter.close();
    }


}
