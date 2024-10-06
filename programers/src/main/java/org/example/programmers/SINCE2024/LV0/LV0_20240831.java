package org.example.programmers.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240831 {
    public static void main(String[] args) {
        int[] num_list1 = {2, 1, 6};  int n1 = 3;//	[6]
        int[] num_list2 = {5, 2, 1, 7, 5};	int n2 = 2;//	[2, 1, 7, 5]

        printarr(solution1(num_list1, n1));
        printarr(solution1(num_list2, n2));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181892
        n번째 원소부터

        n에 명시된 숫자의 번째수 부터 주어진 리스트의 마지막까지 담긴 배열을 리턴 하도록 한다.
        배열번호를 가져와서 리스트에 담은후, 다시 리스트에 담아서 리턴하도록하는 방식이다.
     */
    public static int[] solution1(int[] num_list, int n) {
        int[] answer = new int[num_list.length-(n-1)];

        List<Integer> list = new ArrayList<>();


        for (int i = (n-1); i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }

}
