package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240503 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3}; String direction1 = "right"; //res : [3, 1, 2]
        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6}; String direction2 = "left"; //res : [455, 6, 4, -1, 45, 6, 4]

        for (int val: solution1(numbers1, direction1)) {
            System.out.println(val + ", ");
        }
        System.out.println("====================");
        for (int val: solution1(numbers2, direction2)) {
            System.out.println(val + ", ");
        }







    }


    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120844
    배열 회전시키기


     */
    public static int[] solution1(int[] numbers, String direction) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<Integer>();
        for (int num: numbers) {
            intList.add(num);
        }
        //left 일 경우 전체배열을 왼쪽으로, right일 경우 전체 오른쪽으로 한칸 움직인다.

        answer = new int[numbers.length];

        int start=0;
        int finishSize = 0;
        int addFinal = 0;
        int idx = 0;

        if(direction.equals("left")){
            idx = 0;
            start = 1;
            finishSize = intList.size();
            addFinal = 0;
            answer[finishSize-1] = intList.get(0);

        } else {//right
            idx = 1;
            start = 0;
            finishSize = (intList.size())-1;
            addFinal = intList.size()-1;
            answer[start] = intList.get(addFinal);
        }
        for (int i = start; i < finishSize; i++) {
            answer[idx] = intList.get(i);
            idx++;
        }
        return answer;
    }




}
