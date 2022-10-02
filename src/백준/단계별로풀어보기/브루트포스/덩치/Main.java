package 백준.단계별로풀어보기.브루트포스.덩치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());

        ArrayList<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line);
            Person ps = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            peopleList.add(ps);
        }

        for (int i = 0; i < peopleList.size() - 1; i++) {
            // 본인보다 덩치가 있는 사람의 수에서 1을 더해야 등수를 알 수 있다.
            // 키, 몸무게 둘다 커야 덩치가 크다.
            for (int j = i; j < peopleList.size(); j++) {
                // 내가 덩치가 더 작으면 count 1 증가
                // 상대방이 덩치가 더 크면 상대방의 count 1 증가
                if (peopleList.get(i).weight < peopleList.get(j).weight
                        && peopleList.get(i).height < peopleList.get(j).height) {
                    peopleList.get(i).count += 1;
                } else if (peopleList.get(i).weight > peopleList.get(j).weight
                        && peopleList.get(i).height > peopleList.get(j).height) {
                    peopleList.get(j).count += 1;
                }
            }
        }

        for (Person p : peopleList) {
            sb.append(p.count + 1).append(" ");
        }

        System.out.println(sb);
    }
}

class Person {
    int weight;
    int height;
    int count;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(int weight, int height, int count) {
        this.weight = weight;
        this.height = height;
    }
}
