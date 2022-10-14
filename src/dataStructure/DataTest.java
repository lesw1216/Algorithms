package dataStructure;

import dataStructure.queue.CircleQueue;
import dataStructure.stack.CustomStack;
import dataStructure.리스트.ArrayList.CustomArrayList;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//<<<<<<< HEAD
//
//=======
//>>>>>>> 170668c9f4ca74341f45ebbe75ae3385314d3c99
        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t메인 메뉴");
            System.out.println("1. 스택");
            System.out.println("2. 원형 큐");
            System.out.println("3. 순차 리스트");
            System.out.println("4. 연결 리스트");
            System.out.println("0. 종료");
            System.out.println("==============================");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    playStack(sc);
                    break;
                case 2:
                    playCircleQueue(sc);
                    break;
                case 3:
                    playArrayList(sc);
                    break;
            }
        }
    }
    private static void playCircleQueue(Scanner sc) {
        CircleQueue queue = null;

        System.out.println("\n==============================");
        System.out.println(
                "배열을 이용한 원형 큐를 생성합니다." +
                        "\n기본 크기는 10입니다.\n" +
                        "1. 기본 원형 큐를 생성\n" +
                        "2. 직접 원형 큐의 크기 지정 후 생성");
        System.out.println("==============================");
        System.out.print("번호 선택 후 Enter : ");
        int initStackSetting = sc.nextInt();

        // 큐 크기 설정
        if (initStackSetting == 1) {
            queue = new CircleQueue();
            System.out.println("기본 크기 큐 생성!");
        } else if (initStackSetting == 2) {
            System.out.print("크기를 설정하세요 : ");
            int customCapacity = sc.nextInt();
            queue = new CircleQueue(customCapacity);
            System.out.println(customCapacity + "크기 큐 생성!");
        }

        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t원형 큐");
            System.out.println("1. enQueue");
            System.out.println("2. deQueue");
            System.out.println("3. peek");
            System.out.println("4. 전체 출력");
            System.out.println("5. 초기화");
            System.out.println("0. 메인 메뉴");
            System.out.println("==============================");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    System.out.print("추가하려는 값을 입력하세요 : ");
                    int item = sc.nextInt();
                    queue.enQueue(item);
                    break;
                case 2:
                    Integer removeItem = queue.deQueue();
                    if (removeItem == null)
                        System.out.println("큐는 비어 있습니다!");
                    else
                        System.out.println("큐에서 꺼낸 값 : " + removeItem);
                    break;
                case 3:
                    Integer peekItem = queue.peek();
                    if (peekItem == null)
                        System.out.println("큐는 비어있습니다!");
                    else
                        System.out.println("peek()를 실행한 결과 값은 : " + peekItem);
                    break;
                case 4:
                    queue.allSearch();
                    break;
                case 5:
                    queue.queueInit();
                    System.out.println("초기화 완료!");
                    break;

            }
        }



    }

    public static void playStack(Scanner sc) {
        CustomStack stack = null;

        System.out.println("\n==============================");
        System.out.println(
                "배열을 이용한 스택 생성합니다." +
                        "\n기본 크기는 10입니다.\n" +
                        "1. 기본 스택 생성\n" +
                        "2. 직접 스택의 크기 지정 후 생성");
        System.out.println("==============================");
        System.out.print("번호 선택 후 Enter : ");
        int initStackSetting = sc.nextInt();

        // 스택 크기 설정
        if (initStackSetting == 1) {
            stack = new CustomStack();
            System.out.println("기본 크기 스택 생성!");
        } else if (initStackSetting == 2) {
            System.out.print("크기를 설정하세요 : ");
            int customCapacity = sc.nextInt();
            stack = new CustomStack(customCapacity);
            System.out.println(customCapacity + "크기 스택 생성!");
        }

        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t스택");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. 전체 출력");
            System.out.println("5. 초기화");
            System.out.println("0. 메인 메뉴");
            System.out.println("==============================");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    System.out.print("추가하려는 값을 입력하세요 : ");
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    int pop = stack.pop();
                    System.out.println("pop 실행 : " + pop);
                    break;
                case 3:
                    int peek = stack.peek();
                    System.out.println("peek 실행 : " + peek);
                    break;
                case 4:
                    stack.allSearch();
                    break;
                case 5:
                    stack.stackInit();
                    System.out.println("스택 초기화 완료!");
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
        System.out.println(
                "배열을 이용한 리스트를 생성합니다." +
                "\n기본 크기는 10입니다.\n" +
                "1. 기본 리스트 생성\n" +
                "2. 직접 리스트의 크기 지정 후 생성");
        System.out.println("==============================");
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
            System.out.println("==============================");
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

}
