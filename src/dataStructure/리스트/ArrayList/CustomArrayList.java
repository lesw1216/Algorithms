package dataStructure.리스트.ArrayList;

import dataStructure.리스트.List;

public class CustomArrayList implements List {
    private final int[] array;
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
    if 리스트가 가득 차 있다면
        return false
    else
        마지막 인덱스에 있는 요소부터 다음 인덱스로 시프트
        배열의 원하는 인덱스에 요소 추가
        마지막 데이터 저장 위치를 알기위한 변수 값 1 증가
        return true
     */
    @Override
    public boolean add(int index, int e) {
        // 리스트의 저장공간이 남아있는지 체크
        if (isFull()) {
            // 저장공간 초과
            System.out.println("리스트가 최대값이 저장 되었습니다.");
            return false;
        } else {
            // 기존 인덱스에 위치했던 값들을 하나씩 뒤로 시프트 한다.
            for (int i = point - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }

            array[index] = e;
            point++;
            return true;
        }
    }

    /*
        리스트의 끝에 삽입
        의사 코드
        if 리스트가 가득 차 있다면
            return false
        else
            배열의 끝에 요소 삽입
            마지막 데이터의 저장 위치를 알기 위한 변수 값 1 증가
            return true
     */
    @Override
    public boolean add(int e) {
        // 리스트의 저장공간이 남아있는지 체크
        if (isFull()) {
            // 저장공간 초과
            System.out.println("리스트의 저장공간이 초과되었습니다.");
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

    /*
        리스트에서 특정 인덱스의 값 찾기
        if 선택한 인덱스가 제일 마지막 인덱스보다 크다면
            return null
        else
            return 배열의 해당 인덱스에 위치한 값
     */
    @Override
    public Integer get(int index) {
        if (index >= point)
            return null;
        else
            return array[index];
    }

    /*
        리스트가 비어있는지 체크
        비어있다면 true
        값이 하나라도 존재한다면 false
     */
    @Override
    public boolean isEmpty() {
        return point <= 0;
    }

    /*
        리스트가 가득 차 있는지 체크
        가득 채워져 있다면 true
        한 공간이라도 비었다면 false
     */
    public boolean isFull() {
        return point >= array.length;
    }

    /*
        특정 인덱스에 있는 값 삭제하기
        if 리스트가 비어 있다면
            return null
        else
            임시 변수 = 특정 인덱스에 있는 값
            삭제하는 인덱스 다음 값들을 한칸 앞으로 시프트
            마지막 데이터 저장 위치를 알기위한 변수 값 1 감소
            return 임시 변수
     */
    @Override
    public Integer remove(int index) {
        if (isEmpty()) {
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
            if (i == 0)
                result.append(array[i]);
            else
                result.append(", ").append(array[i]);
        }

        result.append("]");
        return String.valueOf(result);
    }
}
