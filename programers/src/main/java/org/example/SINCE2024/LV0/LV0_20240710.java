package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240710 {
    public static void main(String[] args) {

        String rny_string1 = "masterpiece"; //	"rnasterpiece"
        String rny_string2 = "programmers"; //	"prograrnrners"
        String rny_string3 = "jerry";        //  "jerry"
        String rny_string4 = "burn";    //	"burn"


        System.out.println(solution1(rny_string1));
        System.out.println(solution1(rny_string2));
        System.out.println(solution1(rny_string3));
        System.out.println(solution1(rny_string4));

    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*   https://school.programmers.co.kr/learn/courses/30/lessons/181863
    my_string

    주어진 문자열에서 m을 rm 으로 변경하여 리턴하는 문제이다. 




     */
    public static String solution1(String rny_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] getData = rny_string.split("");
        for (int i = 0; i < getData.length; i++) {
            if(getData[i].equals("m")){
                sb.append("rn");
            }else{
                sb.append(getData[i]);
            }
        }

        answer = sb.toString();

        return answer;
    }


}
