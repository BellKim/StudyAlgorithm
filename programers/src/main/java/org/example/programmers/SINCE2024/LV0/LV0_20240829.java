package org.example.programmers.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240829 {
    public static void main(String[] args) {
        int[] num_list1 = {2, 1, 6};	int n1 = 1;	    //  [1, 6, 2]
        int[] num_list2 = {5, 2, 1, 7, 5}; int n2=	3;	//  [7, 5, 5, 2, 1]

        printarr(solution1(num_list1, n1));
        printarr(solution1(num_list2, n2));



    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181891
        순서 바꾸기
        주어진 배열 num_list 에서 n의 횟수만큼 첫번째 원소를 뒤로 보낸 배열을 리턴해 보도록 한다.
        지우고 추가하는 식으로 반복을 하였다.
     */
    public static int[] solution1(int[] num_list, int n) {
        int[] answer = {};

        List<Integer> numlist = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            numlist.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            int temp = numlist.get(0);
            numlist.remove(0);
            numlist.add(temp);
        }

        answer = new int[numlist.size()];
        for (int i = 0; i < numlist.size(); i++) {
            answer[i] = numlist.get(i);
        }

        return answer;
    }


}
