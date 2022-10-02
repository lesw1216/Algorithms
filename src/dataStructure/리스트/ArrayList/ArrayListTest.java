package dataStructure.리스트.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        boolean contain = list.contains(5);
        System.out.println("5가 있는가? " + contain);

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        System.out.println(list);

        list.remove(4);

        System.out.println();
        System.out.println(list);
    }
}
