package dataStructure.재귀.하노이타워;

public class HanoiTower {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    /*
    n-1 개의 원판을 A -> B 이동
    아래 원판 하나를 A -> C 이동
    n-1 개의 원판을 B -> C 이동

    n-1 개의 원판을 옮기고 큰원판을 옮기고 다시 n-1개의 원판을 옮기는 함수를 반복호출하자

    이때, 재귀의 탈출 조건은?
    옮겨야하는 원판의 수가 1일 경우
     */
    public static void hanoi(int num, char from, char by, char to) {
        if (num == 1) {
            System.out.println("원판 1을 " + from + "에서 " + to + "로 이동");
        } else {
            hanoi(num - 1, from, to, by);
            System.out.println("원판 " + num + "을 " + from + "에서 " + to + "로 이동");
            hanoi(num - 1, by, from, to);
        }
    }
}
