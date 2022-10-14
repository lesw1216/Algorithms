package dataStructure.리스트.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}
