package org.example.SINCE2024.LV0;


public class LV0_20240809 {
    public static void main(String[] args) {

        //  num_list	result
        int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};    //	5
        int[] num_list2 = {13, 22, 53, 24, 15, 6};        //    -1
        int[] num_list3 = {-1,2,3,4,5,6};        //    -1




        System.out.println(solution1(num_list1));
        System.out.println(solution1(num_list2));
        System.out.println(solution1(num_list3));



    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181896
        첫번째 음수
        음수가 발생하는 지점의 숫자를 리턴해주면 된다.!
        너무 어려운 문제이다...

     */

    public static int solution1(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0){
                return i;
            }
        }


        return answer;
    }




}

