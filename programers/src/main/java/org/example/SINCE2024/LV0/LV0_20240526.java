package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240526 {
    public static void main(String[] args) {
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score3 = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {1, 1}}; //[3, 3, 1, 1, 5, 6]

        int[][] score4 = {{1, 1}, {0, 0}, {2, 2}};

        pritnALl(solution1(score1));
        pritnALl(solution1(score2));
        pritnALl(solution1(score3));
        pritnALl(solution1(score4));

    }

    public static void pritnALl(int[] score){
        for(int val : score){
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120882
        등수 매기기
        2차원 배열 안에 2개의 숫자가 주어진다. 그 주어진 숫자의 평균을 등수로 나타낸다.
        int자료형으로 평균을 낼 경우 자연수 범위까지만 표현되기때문에 .... 그냥 점수의 총합으로 구별하도록 하자.
        (정통 방법으로 하려면 double 자료형으로 값을 저장해서 비교해야 한다.)

        등수 표현은...
        0번배열을 n 번배열까지 비교해서
        비교한 숫자가 더 클경우 0번배열의 순위숫자를 1증가시킴.
        1번배열을 n번 배열까지 비교...
        ....반복



     */
    public static int[] solution1(int[][] score) {
        int[] answer = {};

        int[] avgScore = new int[score.length];
        answer = new int[score.length];
        for (int i = 0; i < avgScore.length; i++) {
            avgScore[i] = (score[i][0] + score[i][1]);
        }

        for (int i = 0; i < avgScore.length; i++) {
            answer[i] = 1; //초기값 설정
            for (int k = 0; k < avgScore.length; k++) {
                if(avgScore[i] < avgScore[k]){ //i번 배열의 총합이 k 의 배열보다 클경우
                    answer[i] = answer[i] + 1;   //등수를 증가시킨다. 
                }
            }
        }
        return answer;
    }





    @Test
    public void test1() {
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        for(int[] val : score1){
            System.out.println(val[0] + ", " + val[1]);
        }

    }

}
