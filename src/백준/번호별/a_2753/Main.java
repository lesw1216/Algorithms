package a_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int leapYear = Integer.parseInt(bf.readLine());

        if (leapYear < 1 || leapYear > 4000)
            return;

        /*
        * 윤년은
        * 1. 4의 배수이고, 100의 배수가 아니다.
        * 2. 400의 배수이다.
        * */
        if (((leapYear % 4 == 0) && (leapYear % 100 != 0)) || (leapYear % 400 == 0))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
