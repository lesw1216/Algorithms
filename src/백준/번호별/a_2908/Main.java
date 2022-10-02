package a_2908;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Constant ct = new Constant();
        ct.run(new BufferedReader(new InputStreamReader(System.in)));
    }
}

class Constant {
    public void run(BufferedReader bf) throws IOException {
        String[] line = bf.readLine().split(" ");

        int changeNumA = changeSeat(Integer.parseInt(line[0]));
        int changeNumB = changeSeat(Integer.parseInt(line[1]));

        int bigNum = compareSize(changeNumA, changeNumB);

        System.out.println(bigNum);
    }

    private int changeSeat(int num) {
        int hun = num / 100;
        int ten = num / 10 % 10;
        int one = num % 10;

        return (one * 100) + (ten * 10) + hun;
    }

    private int compareSize(int numA, int numB) {
        if (numA > numB)
            return numA;
        else
            return numB;
    }

}