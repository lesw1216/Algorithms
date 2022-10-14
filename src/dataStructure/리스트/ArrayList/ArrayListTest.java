package dataStructure.리스트.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

<<<<<<< HEAD
        for (int i = 0; i < 10; i++) {
=======
        boolean contain = list.contains(5);
        System.out.println("5가 있는가? " + contain);

        for (int i = 1; i < 11; i++) {
>>>>>>> 170668c9f4ca74341f45ebbe75ae3385314d3c99
            list.add(i);
        }

        System.out.println(list);
<<<<<<< HEAD
=======

        list.remove(4);

        System.out.println();
        System.out.println(list);
>>>>>>> 170668c9f4ca74341f45ebbe75ae3385314d3c99
    }
}
