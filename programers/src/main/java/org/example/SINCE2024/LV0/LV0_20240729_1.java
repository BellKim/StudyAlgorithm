package org.example.SINCE2024.LV0;


public class LV0_20240729_1 {
    public static void main(String[] args) {
        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"}; //	19000
        String[] order2 = {"americanoice", "americano", "iceamericano"};	//  13500


        System.out.println(solution1(order1));
        System.out.println(solution1(order2));







    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*      https://school.programmers.co.kr/learn/courses/30/lessons/181837
        커피 심부름
        아메리카노 4500원과
        카페라테 5000원의 갯수를 구해서 리턴하는 문제이다.

        처음에는 모든 문자열에 대해서 hashmap에 넣어 가격을 리턴하였는데

        latte의 문자 존제 유무만 따져서 존재하면 5000원, 존재하지않으면 4500원으로 값이 나오도록 하였따.

        아메리카노와 라테 뭘 하던 상관없었지만 "아무거나" 옵션일 경우에도 아메리카노의 가격을 선정하기 때문에 라떼의 조건을 통하여 가격을 산출하였다. 



     */

    public static int solution1(String[] order) {
        int answer = 0;

        for (String orderMenu : order) {
            answer += orderMenu.contains("cafelatte") ? 5000 : 4500;
        }


        return answer;
    }

}

