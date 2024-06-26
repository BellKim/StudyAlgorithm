package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240626 {

    public static void main(String[] args) {

        String[] spell1 = {"p", "o", "s"};	        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"}; //	2
        String[] spell2 = {"z", "d", "x"};	        String[] dic2 = {"def", "dww", "dzx", "loveaw"};    //	1
        String[] spell3 = {"s", "o", "m", "d"};	    String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};//	2

        System.out.println(solution1(spell1,dic1));
        System.out.println(solution1(spell2,dic2));
        System.out.println(solution1(spell3,dic3));
    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120869
    외계어 사전
    dic에 있는 문자가 spell에 존재 하는지 확인한다.
    각 spell에 dic이 존재하는지 확인 하면 된다.
    2중포문으로 문자열 비교하면 될듯하다.


     */


public static int solution1(String[] spell, String[] dic) {
    for(int i=0; i<dic.length; i++) {
        int answer = 0;
        for(int j=0; j<spell.length; j++) {
            if(dic[i].contains(spell[j])) answer++;
        }
        if(answer == spell.length)
            return 1;
    }
    return 2;


}
    @Test
    public void test1() {


    }





}
