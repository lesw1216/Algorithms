package divideAndConquer.baekjoon.num2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 색종이 만들기, 2630번
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ColorPaper cp = new ColorPaper();
        int size = cp.InputData(new BufferedReader(new InputStreamReader(System.in)));
        cp.dividePaper(0, 0, size);
        cp.getWhiteAndBlue();
    }
}

class ColorPaper {

    private int sideLength;
    private int[][] pArr;
    private int white;
    private int blue;


    public int InputData(BufferedReader bf) throws IOException {
        sideLength = Integer.parseInt(bf.readLine());
        pArr = new int[sideLength][sideLength];

        for (int i = 0; i < sideLength; i++) {
            String[] strings = bf.readLine().split(" ");
            for (int j = 0; j < sideLength; j++) {
                pArr[i][j] = Integer.parseInt(strings[j]);
            }
        }

        return sideLength;
    }

    public void dividePaper(int x, int y, int size) {

        if (colorCheck(x, y, size)) {
            if (pArr[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int sizeDivide = size / 2;
        // 왼쪽 위
        dividePaper(x, y, sizeDivide);
        // 오른쪽 위
        dividePaper(x, y + sizeDivide, sizeDivide);
        // 왼쪽 아래
        dividePaper(x + sizeDivide, y, sizeDivide);
        // 오른쪽 아래
        dividePaper(x + sizeDivide, y + sizeDivide, sizeDivide);
    }

    public void getWhiteAndBlue() {
        System.out.println(white);
        System.out.println(blue);
    }

    private boolean colorCheck(int x, int y, int size) {
        int color = pArr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (pArr[i][j] != color)
                    return false;
            }
        }
        // 해당 색종이임을 의미
        return true;
    }
}
