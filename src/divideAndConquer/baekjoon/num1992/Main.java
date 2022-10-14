package divideAndConquer.baekjoon.num1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        QuadTree qt = new QuadTree();
        int sideLength = qt.inputDate(new BufferedReader(new InputStreamReader(System.in)));
        String compressResult = qt.videoCompress(0, 0, sideLength);
        System.out.println(compressResult);
    }
}

/**
 * 어떤 행동을 할 수 있을까
 * 1. 데이터를 입력받는다.
 * 2. 사각형의 시작 지점을 매개변수로 받아 압축을 수행한다.
 */
class QuadTree {
    private int[][] videoArr;
    private int callCount;

    public int inputDate(BufferedReader bf) throws IOException {
        int sideLength = Integer.parseInt(bf.readLine());
        videoArr = new int[sideLength][sideLength];

        for (int i = 0; i < sideLength; i++) {
            String[] stringVideoArr = bf.readLine().split("");
            for (int j = 0; j < sideLength; j++) {
                videoArr[i][j] = Integer.parseInt(stringVideoArr[j]);
            }
        }

        return sideLength;
    }

    /**
     * 현재 범위의 사각 보드가 모두 0, 1인지 확인
     * 동일하지 않으면 재귀함수로 사각 보드를 다시 나눔
     * @param x
     * @param y
     * @return
     */
    public String videoCompress(int x, int y, int size) {
        // 0, 1을 체크하고 반환
        if (check(x, y, size)){
            // true, 모든 값이 동일하다
            return String.valueOf(videoArr[y][x]);
        }
        // 위에 조건이 false라면 사각형의 크기를 다시 줄여야함

        int divideSizeLength = size / 2;

        return "(" + videoCompress(x, y, divideSizeLength) +
                     videoCompress(x + divideSizeLength, y, divideSizeLength) +
                     videoCompress(x, y + divideSizeLength, divideSizeLength) +
                     videoCompress(x + divideSizeLength, y + divideSizeLength, divideSizeLength)
                + ")";
    }

    private boolean check(int x, int y, int size) {
        int stdValue = videoArr[y][x];

        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (videoArr[i][j] != stdValue){
                    return false;
                }
            }
        }

        return true;
    }
}
