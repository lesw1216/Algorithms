package a_2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(bf.readLine());
        bf.close();

        if (isNotRangeOfHour(hour) || isNotRangeOfMinute(minute) || isNotRangeOfTime(time))
            return;

        Oven oven = new Oven();
        oven.setTimer(hour, minute, time);
        oven.printTime();
    }

    public static boolean isNotRangeOfHour(int hour) {
        if (hour < 0 || hour > 23)
            return true;
        else
            return false;
    }

    public static boolean isNotRangeOfMinute(int minute) {
        if (minute < 0 || minute > 59)
            return true;
        else
            return false;
    }

    public static boolean isNotRangeOfTime(int time) {
        if (time < 0 || time > 1000)
            return true;
        else
            return false;
    }
}

class Oven {
    int hour;
    int minute;
    int time;

    public void setTimer(int hour, int minute, int time) {
        this.hour = hour;
        this.minute = minute;
        this.time = time;
    }

    public void printTime() {
        minute += time;

        while (minute > 59) {
            hour++;
            minute -= 60;
            if (hour > 23)
                hour = 0;
        }

        System.out.println(hour + " " + minute);
    }
}