package org.example.SINCE2024.LV0;


public class LV0_20250623 {
    public static void main(String[] args) {
        int[] sides1 = {1, 2};//	1
        int[] sides2 = {3, 6};//	5
        int[] sides3 = {11, 7};//	13

        System.out.println(solution1(sides1));
        System.out.println(solution1(sides2));
        System.out.println(solution1(sides3));


    }



    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120868
        삼각형의 완성조건
        가장 긴 변이 11인 경우
        될 수 있는 나머지 한 변은 5, 6, 7, 8, 9, 10, 11 로 7개입니다.
        나머지 한 변이 가장 긴 변인 경우
        될 수 있는 한 변은 12, 13, 14, 15, 16, 17 로 6개입니다.
        따라서 7 + 6 = 13을 return합니다.


     */

    public static int solution1(int[] sides) {
        int answer = 0;
        //두변중 큰변이 있을때
        int bigOne = sides[0] >= sides[1] ? 0 : 1;
        int bigTwo = sides[0] >= sides[1] ? 1 : 0;
        for (int i = 1; i <= (sides[bigOne] + sides[bigTwo]); i++) {
            if (((sides[bigOne] + sides[bigTwo]) >= i)  && sides[bigOne] < i) {
                answer += 1;
            }
        }
        //나머지 한번이 큰변일때
        for (int i = 1; i <= (sides[bigOne]+sides[bigTwo]); i++) {
            if( sides[bigOne] < i && (sides[bigOne]+sides[bigTwo] > i) ){
                answer+=1;
            }
        }
        return answer;
    }





}
