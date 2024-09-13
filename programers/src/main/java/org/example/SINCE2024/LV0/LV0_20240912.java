package org.example.SINCE2024.LV0;


public class LV0_20240912 {
    public static void main(String[] args) {

       int start_num= 3; int end_num=10;    //	[3, 4, 5, 6, 7, 8, 9, 10]

        printarr(solution1(start_num, end_num));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/181920
        카운트업
        시작 숫자부터 끝수짜까지를 배열에 넣고 그 배열을 리턴한다.

        끝점과 시작점을 이용해 배열의 크기를 리턴하고
        시작점을 이용해 시작숫자를 조절한다. 

        맨날 문제만 푸는데... 퇴근이 늦어서 ㅠㅠ 우짤수없다 ㅠㅠ 이거라도 해야지 ㅠㅠ

     */

    public static int[] solution1(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = start_num + i;
            }



        return answer;
    }

}

