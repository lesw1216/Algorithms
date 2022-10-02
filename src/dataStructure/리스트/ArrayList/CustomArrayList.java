package dataStructure.리스트.ArrayList;

import dataStructure.리스트.List;

public class CustomArrayList implements List {
    private int[] array;
    private int point;
    private final int capacity;
    public CustomArrayList() {
        capacity = 10;
        array = new int[capacity];
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    /*
    리스트 중간에 데이터 삽입하기
    if list empty
        throw error
    else
        list[index] = element;
     */
    @Override
    public boolean add(int index, int e) {
        // 리스트의 저장공간이 남아있는지 체크
        if (!isEmpty()) {
            // 저장공간 초과
            System.out.println("리스트가 최대값이 저장 되었습니다.");
            return false;
        } else {
            // 데이터 추가
            array[index] = e;
            point++;
            return true;
        }
    }

    /*
        리스트의 끝에 삽입
     */
    @Override
    public boolean add(int e) {
        // 리스트의 저장공간이 남아있는지 체크
        if (!isEmpty()) {
            // 저장공간 초과
            System.out.println("리스트가 최대값이 저장 되었습니다.");
            return false;
        } else {
            array[point] = e;
            point++;
            return true;
        }
    }

    /*
        특정 값이 리스트에 존재하는지 확인하기 위한 메서드
     */
    @Override
    public boolean contains(int e) {
        for (int v : array) {
            if (v == e)
                return true;
        }

        return false;
    }

    /*
        모든 요소 삭제
     */
    @Override
    public void clear() {
        point = 0;
    }

    @Override
    public Integer get(int index) {
        if (point == 0) {
            return null;
        } else {
            return array[index];
        }
    }

    @Override
    public boolean isEmpty() {
        return point != array.length;
    }

    @Override
    public Integer remove(int index) {
        if (isEmpty()) {
            // 리스트 비어있을 때
            return null;
        } else {
            int temp = array[index];
            for (int i = index+1; i < array.length; i++) {
                array[i - 1] = array[i];
            }

            point--;
            return temp;
        }
    }

    @Override
    public int size() {
        return point;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i < point; i++) {
            if (i == 0) {
                result.append(array[i]);
            }
            result.append(", ").append(array[i]);
        }

        result.append("]");
        return String.valueOf(result);
    }
}
