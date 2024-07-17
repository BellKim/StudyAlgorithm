package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240717 {
    public static void main(String[] args) {
        int[] num_list1 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};    //	[15, 32, 38, 46, 56]

        printarr(solution1(num_list1));






    }

    public static void printarr(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181852
        뒤에서 5등 뒤로

        리스트를 나열해서 뒤에서 5명 이후 인원을 배열에 담아 리턴하도록 한다.

     */


    public static int[] solution1(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        List<Integer> integerList = new ArrayList<>();
        Arrays.sort(num_list);

        for (int i = 0; i < num_list.length; i++) {
            if(i>4) {
                integerList.add(num_list[i]);
            }
        }
        Collections.sort(integerList);

        for (int i = 0; i < integerList.size(); i++) {
            answer[i] = integerList.get(i).intValue();
        }
        return answer;
    }



}
