package org.example.BEFORE2024.programmers_lv0;

public class example003 {

// programmers.co.kr/learn/courses/30/lessons/120830 양꼬치


    /**
     * k: 양꼬치 12000원 n: 음료수 2000원
     */
    public static void main(String[] args) {

//        int res = solution(10, 3);
        int res = solution(64, 6);

        System.out.println("res = " + res);

    }

    static int solution(int n, int k) {
        int answer = 0;

        int yang = 0;
        int drink = 0;
        int service = 0;

        yang = n * 12000;
        drink = k * 2000;
        service = (n/10)*2000;

        System.out.println("service = 1 * 2000 = 2000 = " + service);


        answer = yang + drink - service;


        return answer;
    }

}
