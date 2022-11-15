package org.example.programmers_lv0;

public class example015 {

//      아이스 아메리카노
//    https://school.programmers.co.kr/learn/courses/30/lessons/120819

    /*
     *  아이스 아메리카노는 한잔에 5,500원입니다.
     *  머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
     *  머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을
     *  순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     *
     */

    public static void main(String[] args) {

        int money = 5400;
//        int money = 15000;

        int [] res = solution(money);

        for(int rr : res){
            System.out.println("[ "+ rr + " ] ");
        }


//        System.out.println("테스트 코드 = " + (double)2/10 + " ////");


    }

    static int[] solution(int money) {
        int [] answer = new int[2];

        final int americano = 5500;
        // [최대 먹을수있는 아메리카노 수, 최대잔수 계산하고 남은돈 ] 으로 산출
        answer[0] = money/americano;
        answer[1] = money%americano;


        return answer;
    }

}
















