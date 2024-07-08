package org.example.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240708 {

    public static void main(String[] args) {


            int[] num_list1 = {2, 1, 6};         // [2, 1, 6, 5]
            int[] num_list2 = {5, 2, 1, 7, 5};  //  [5, 2, 1, 7, 5, 10]

            printarr(solution1(num_list1));
            printarr(solution1(num_list2));


        }

        public static void printarr(int[] num){
            System.out.println("print ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + ", ");
            }
            System.out.println();
        }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181927
        마지막 두원소

    정수 리스트 num_list가 주어질 때,
     전원소 < 마지막  마지막-전원소
    마지막 원소가 그전 원소보다 크면, 마지막 원소에서 그전 원소를 뺀 값을

     전원소 > 마지막  마지막*2
    마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을

    추가하여 return하도록 solution 함수를 완성해주세요.


    입출력 예 #1
    마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
    입출력 예 #2
    마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.



     */

        public static int[] solution1(int[] num_list) {
            int[] answer = {};

            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < num_list.length; i++) {
                integerList.add(num_list[i]);
            }

            int lastAtomic = integerList.get(integerList.size() - 1);
            int lastBeforeAtomic = integerList.get(integerList.size() - 2);

            if(lastAtomic > lastBeforeAtomic){
                integerList.add(lastAtomic- lastBeforeAtomic);
            }else {
                integerList.add(lastAtomic*2);
            }

            answer = new int[integerList.size()];


            for (int k = 0; k < answer.length; k++) {
                answer[k] = integerList.get(k);
            }



            return answer;
        }


    }

















