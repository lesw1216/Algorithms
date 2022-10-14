package dataStructure.리스트;

public interface List {

    boolean add(int e);
    boolean add(int index, int e) throws Exception;

    void clear();

    Integer get(int index);
    boolean contains(int e);


    boolean isEmpty();

    Integer remove(int index);

    int size();

}
