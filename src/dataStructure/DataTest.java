package dataStructure;

import dataStructure.queue.CircleQueue;
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
        CustomStack<Integer> stack = null;

        while (true) {
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
                stack = new CustomStack<>();

                System.out.println("== 기본 크기 스택 생성 ==");
                break;
            } else if (initStackSetting == 2) {
                System.out.print("스택 사이즈를 설정하세요 : ");

                int customCapacity = sc.nextInt();
                stack = new CustomStack<>(customCapacity);

                System.out.println("== " + customCapacity + " 사이즈 스택 생성 ==");
                break;
            } else
                System.out.println("== 1 또는 2번을 입력해주세요 ==");
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
                    // push 입력
                    System.out.print("PUSH 하고 싶은 값을 입력하세요 : ");
                    int item = sc.nextInt();

                    // 데이터 저장 성공 여부 확인 처리
                    if (stack.push(item))
                        System.out.println("== PUSH 성공 ==");
                    else
                        System.out.println("== PUSH 실패 ==");
                    break;
                case 2:
                    Integer pop = stack.pop();

                    // POP 성공 여부에 따른 처리
                    if (pop == null)
                        System.out.println("== 스택에 데이터가 없습니다 ==");
                    else
                        System.out.println("== 스택에서 꺼낸 값 : " + pop + " ==");
                    break;
                case 3:
                    Integer peek = stack.peek();

                    // PEEK 성공 여부에 따른 처리
                    if (peek == null)
                        System.out.println("== 스택에 데이터가 없습니다 ==");
                    else
                        System.out.println("== 스택에서 꺼낸 값 : " + peek + " ==");
                    break;
                case 4:
                    stack.allSearch();
                    break;
                case 5:
                    stack.stackInit();
                    System.out.println("== 스택 초기화 완료 ==");
                    break;
                default:
                    System.out.println("== 잘못 입력하였습니다. 다시 입력해주세요 ==");
            }
        }

    }

    public static void playArrayList(Scanner sc) {
        CustomArrayList list = null;
        int item = 0;
        int index = 0;

        setting:
        while (true) {
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
            switch (initListSetting) {
                case 1:
                    list = new CustomArrayList();
                    System.out.println("== 기본 크기 리스트 생성 ==");
                    break setting;
                case 2:
                    System.out.print("크기를 설정하세요 : ");
                    int customCapacity = sc.nextInt();
                    list = new CustomArrayList(customCapacity);
                    System.out.println("== " + customCapacity + " 크기 리스트 생성 ==");
                    break setting;
                default:
                    System.out.println("==  1 또는 2번을 입력해주세요 ==");
            }

        }


        while (true) {
            System.out.println("\n==============================");
            System.out.println("\t\t\t순차 리스트");
            System.out.println("1. 리스트 끝에 추가");
            System.out.println("2. 원하는 인덱스에 추가");
            System.out.println("3. 리스트에 특정 값 존재 확인");
            System.out.println("4. 특정 인덱스 값 찾기");
            System.out.println("5. 특정 인덱스 값 삭제");
            System.out.println("6. 저장된 데이터 갯수 구하기");
            System.out.println("7. 리스트 출력");
            System.out.println("8. 초기화");
            System.out.println("0. 메인 메뉴");
            System.out.println("==============================");
            System.out.print("번호 선택 후 Enter : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0: // 메인 메뉴
                    return;

                case 1: // 리스트 끝에 추가
                    System.out.print("리스트에 저장할 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.add(item))
                        System.out.println("== 저장 성공 ==");
                    else
                        System.out.println("== 저장 실패 ==");

                    break;
                case 2: // 원하는 인덱스에 추가
                    System.out.print("저장할 인덱스를 입력하세요(0 부터) : ");
                    index = sc.nextInt();
                    System.out.print("저장할 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.add(index, item))
                        System.out.println("== 저장 성공 ==");
                    else
                        System.out.println("== 저장 실패 ==");

                    break;
                case 3: // 특정 값 확인
                    System.out.print("찾고 싶은 값을 입력하세요 : ");
                    item = sc.nextInt();
                    if (list.contains(item))
                        System.out.println("== 있음 ==");
                    else
                        System.out.println("== 없음 ==");

                    break;
                case 4: // 특정 인덱스 값 확인
                    System.out.print("찾고 싶은 위치의 인덱스를 입력하세요 : ");
                    index = sc.nextInt();
                    Integer findItem = list.get(index);

                    if(findItem == null)
                        System.out.println("== 탐색 실패 ==");
                    else
                        System.out.println("== 탐색 성공 : " + findItem + " ==");

                    break;
                case 5: // 특정 인덱스 값 삭제
                    System.out.print("삭제하고 싶은 인덱스를 입력하세요 : ");
                    index = sc.nextInt();
                    Integer removeItem = list.remove(index);

                    if (removeItem == null)
                        System.out.println("== 삭제 실패 ==");
                    else
                        System.out.println("== 삭제 성공 : " + removeItem + " ==");

                    break;
                case 6: // 데이터 갯수 확인
                    System.out.println("== TOTAL : " + list.size() + " ==");
                    break;

                case 7: // 모든 데이터 출력
                    System.out.println(list);
                    break;

                case 8: // 초기화
                    list.clear();
                    System.out.println("== 초기화 성공! ==");
            }
        }
    }

}
