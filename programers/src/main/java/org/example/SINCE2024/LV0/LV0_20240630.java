package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LV0_20240630 {
    public static void main(String[] args) {
        int[] common1 = {1, 2, 3, 4};       //5     +1 등차
        int[] common2 = {2, 4, 8};          //16    *2 등비
        int[] common3 = {1, 4, 7, 10};      //13    +3 등차
        int[] common4 = {1, 3, 9, 27};      //81    *3 등비
        int[] common5 = {1, 3, 9};          //27      *3 등비
        int[] common6 = {};         //

        System.out.println(solution1(common1));
        System.out.println(solution1(common2));
        System.out.println(solution1(common3));
        System.out.println(solution1(common4));
        System.out.println(solution1(common5));
        System.out.println(solution1(common6));
    }



    /*    https://school.programmers.co.kr/learn/courses/30/lessons/120924

        다음에 올 숫자

        배열에 주어진 숫자 다음의 수를 산출해서 리턴하면 된다.

        배열들의 숫자를 가지고 등차수열과 등비수열을 적용하여 결과값을 추출해 내면 된다.

        등차수열은 최초 숫자에서 일정한 수를 동일하게 더해주는것
        a a+3 +3 +3 +3 +3 ....

        등비수열은 최초숫자에서 일정한 수를 일정하게 곱해주는것
        a a*2 *2 *2 *2 ......

        >> 고통받은 부분 ...
        common에 주어진 숫자중 0이 있었을 경우 n/0이 된다.
        이런 테스트 케이스의 경우 런타임 오류를 뱉어내게 된다.
     */


    public static int solution1(int[] common) {
        int answer = 0;

        List<Integer> intMultipleList = new ArrayList<Integer>();
        List<Integer> intSumList = new ArrayList<Integer>();
        for(int i = 0; i < common.length; i++) {
            if((i+1< common.length)  ){
                if(common[i] != 0) {
                    //등차감지
                    intSumList.add((common[i + 1] - common[i]));
                    //등비감지
                    intMultipleList.add(common[i + 1] / common[i]);
                }else{
                    //등차감지
                    intSumList.add((common[i + 1] - common[i]));
                    //등비감지
                    intMultipleList.add(common[i + 1] / 1);
                }
            }
        }

        int sumStstus = (int)(intSumList.get(0).intValue());
        int multipleStatus = (int)(intMultipleList.get(0).intValue());
        for(int i = 1 ; i < intSumList.size() ; i++) {
            if(!Objects.equals(sumStstus, (int)(intSumList.get(i).intValue()))) {
                sumStstus = -999999;
            }
            if(!Objects.equals(multipleStatus, (int)(intMultipleList.get(i).intValue()))) {
                multipleStatus=-999999;
            }
        }

        if(sumStstus != -999999) {
            answer = common[common.length - 1]+sumStstus;
        }else if(multipleStatus != -999999) {
            answer = common[common.length - 1]*multipleStatus;
        }

        return answer;
    }





}
