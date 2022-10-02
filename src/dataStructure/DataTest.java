package dataStructure;

import dataStructure.stack.CustomStack;
import dataStructure.리스트.ArrayList.CustomArrayList;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t메인 메뉴");
            System.out.println("1. 스택");
            System.out.println("2. 순차 리스트");
            System.out.println("3. 연결 리스트");
            System.out.println("4. 큐");
            System.out.println("0. 종료");
            System.out.println("==============================\n");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    playStack(sc);
                    break;
                case 2:
                    playArrayList(sc);
                    break;
                case 3:
                    playQueue(sc);
            }
        }
    }

    private static void playQueue(Scanner sc) {

    }

    public static void playStack(Scanner sc) {
        CustomStack stack = new CustomStack();

        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t스택");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. 전체 출력");
            System.out.println("5. 초기화");
            System.out.println("0. 메인 메뉴");
            System.out.println("==============================\n");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    System.out.println("추가하려는 값을 입력하세요 : ");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    int pop = stack.pop();
                    System.out.println("pop() : " + pop);
                    break;
                case 3:
                    int peek = stack.peek();
                    System.out.println("peek() : " + peek);
                    break;
                case 4:
                    stack.allSearch();
                    break;
                case 5:
                    stack.stackInit();
                    System.out.println("스택 초기화");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }

    }

    public static void playArrayList(Scanner sc) {
        CustomArrayList list = null;
        int item = 0;
        int index = 0;

        System.out.println("\n==============================");
        System.out.println("배열을 이용한 리스트를 생성합니다. 기본 크기는 10입니다.\n" +
                "1. 기본 리스트 생성\n" +
                "2. 직접 리스트의 크기 지정 후 생성");
        System.out.println("==============================\n");
        System.out.print("번호 선택 후 Enter : ");
        int initListSetting = sc.nextInt();

        // 리스트 크기 설정
        if (initListSetting == 1) {
            list = new CustomArrayList();
            System.out.println("기본 크기 리스트 생성 완료");
        } else if (initListSetting == 2) {
            System.out.print("크기를 설정하세요 : ");
            int customCapacity = sc.nextInt();
            list = new CustomArrayList(customCapacity);
        }

        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t순차 리스트");
            System.out.println("1. 리스트 끝에 값 넣기");
            System.out.println("2. 리스트 중간에 값 넣기");
            System.out.println("3. 리스트에 해당 값 있는지 확인");
            System.out.println("4. 해당 인덱스에 있는 값 찾기");
            System.out.println("5. 해당 인덱스에 있는 값 삭제");
            System.out.println("6. 리스트에 저장된 요소 총 갯수 구하기");
            System.out.println("7. 리스트 출력");
            System.out.println("8. 초기화");
            System.out.println("0. 메인 메뉴");
            System.out.println("==============================\n");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;

                case 1:
                    System.out.print("리스트에 저장할 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.add(item))
                        System.out.println("저장 성공!");
                    else
                        System.out.println("저장 실패!");
                    break;

                case 2:
                    System.out.print("값을 저장하기 위해 인덱스를 입력하세요 0부터 : ");
                    index = sc.nextInt();
                    System.out.print("리스트에 저장할 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.add(index, item))
                        System.out.println("저장 성공!");
                    else
                        System.out.println("저장 실패!");
                    break;

                case 3:
                    System.out.print("찾고 싶은 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.contains(item))
                        System.out.println("입력한 값은 리스트에 존재 합니다.");
                    else
                        System.out.println("리스트에 존재 하지 않습니다.");
                    break;

                case 4:
                    System.out.print("찾고 싶은 위치의 인덱스를 입력하세요 : ");
                    index = sc.nextInt();
                    Integer findItem = list.get(index);
                    if(findItem == null)
                        System.out.println("해당 인덱스에 값이 존재하지 않습니다.");
                    else
                        System.out.println("인덱스 " + index + "위치에 존재하는 값 : " + findItem);
                    break;

                case 5:
                    System.out.print("삭제하고 싶은 인덱스를 입력하세요 : ");
                    index = sc.nextInt();
                    Integer removeItem = list.remove(index);
                    if (removeItem == null)
                        System.out.println("해당 인덱스에 값이 존재하지 않습니다.");
                    else
                        System.out.println("삭제한 값 : " + removeItem);
                    break;

                case 6:
                    System.out.println("리스트에 저장된 요소의 수 :  " + list.size());
                    break;

                case 7:
                    System.out.println(list.toString());
                    break;

                case 8:
                    list.clear();
                    System.out.println("초기화 성공!");
            }
        }
    }

    public static void screenClear() {
        for (int i = 0; i < 80; i++) {
            System.out.println("");
        }
    }
}
