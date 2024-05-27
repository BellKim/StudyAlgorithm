package org.example.SINCE2024.LV0;

public class LV0_20240527 {
    public static void main(String[] args) {
        int order1 = 3;     //1
        int order2 = 29423; // 2

        System.out.println(solution1(order1));
        System.out.println(solution1(order2));


    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120891
        3 6 9 게임
        주어진 숫자에 3 6 9의 갯수를 리턴하는 프로그램을 구형하라.
        모든 자리수에서  3, 6, 9 가 있는지 검사하면 된다.
        숫자를 문자로 바꿔서  배열로 나눈다음, 문자열 비교를 진행한다.

        나의경우 3으로 나눈 나머지가 0인것만 고려하여 프로그램을 구성하였는데
        0이 나오면 나머지가 0이되므로, 0이 아닌것과 3으로 나눈 나머지가 0인것 총 2가지 조건을 모두 고려해야한다.

     */

    public static int solution1(int order) {
        int answer = 0;

        String[] numbers = Integer.toString(order).split("");
        for(String val: numbers){
            if((Integer.parseInt(val)%3 == 0) && (Integer.parseInt(val) != 0)){
                answer ++;
            }
        }

        return answer;
    }


}
