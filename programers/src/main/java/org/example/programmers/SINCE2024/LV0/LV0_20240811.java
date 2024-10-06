package org.example.programmers.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240811 {
    public static void main(String[] args) {

        int start_num1 = 10; 	int end_num = 3;    //	[10, 9, 8, 7, 6, 5, 4, 3]

        printarr(solution1(start_num1, end_num));


    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181899
        카운트다운

        10부터 3까지 감소하는 수를 담은 리스트를 배열로 리턴하시오.


     */

    public static int[] solution1(int start_num, int end_num) {
        int[] answer = new int[start_num+1 -  end_num];

        List<Integer> intList = new ArrayList<>();

        for (int i = start_num; i >= end_num; i--) {
            intList.add(i);
        }

        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }





}
