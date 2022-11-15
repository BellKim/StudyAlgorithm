package org.example.programmers_lv0;

public class example009 {

// programmers.co.kr/learn/courses/30/lessons/120824 피자 나눠 먹기 (1)
//    https://school.programmers.co.kr/learn/courses/30/lessons/120824

    /*
     * 조각이 7조각인 피자판이 있는데
     * n 명이 나눠먹을 최소한의 피자갯수.
     * 8명일 경우 1판에 1조각이 모자르니 추가1판해서 2판의 결과가 나오도록.
     * (나머지가 나오면 결과값에 +1 해줌)
     *
     */

    public static void main(String[] args) {

        int pice = 15;
        //7, 1, 3

        int res = solution(pice);



        System.out.println(res);

    }

    static int solution(int n) {
        int answer= 0;

        if(n%7 >= 1){
            answer = (n/7) +1;
        }else{
            answer = (n/7);
        }

        return answer;
    }

}
