package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LV0_20240424 {
    public static void main(String[] args) {
        int[] intValue0 = {1};
        int[] intValue1 = {1,1,1,1,2,3};
        int[] intValue2 = {1,2,2,3,4,5};
        int[] intValue3 = {1,1,2,2,3,4,5};
        int[] intValue4 = {1,2,1,2,1,2,1}; // 1-4 2-3 최빈값 4
        int[] intValue5 = {1,1,1,1,1}; // 1-4 2-3 최빈값 4
        int[] intValue6 = {1,1,123}; // 1-4 2-3 최빈값 4



        System.out.println("---- [ "+solution1(intValue6)+" ] ----");

    }



    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120812#qna
    최빈값 구하기
    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.



     */
//void map_testcode(){
    public static int solution1(int[] array) {
        int answer = 0;
        Map<Integer, Integer> mapList = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(mapList.containsKey(array[i])){ //기존값 유무확인(T/F)
                int oldValue = mapList.get(array[i]);
                mapList.replace(array[i], oldValue, oldValue+1 ); //oldValue가 일치하지 않으면 값이 입력되지 않음.
            }else{ //기존 key값이 없을경우
                //new key and value input
                mapList.put(array[i],1);
            }
        }
        int maxCountKey = 0;
        int maxValTemp = 0;
        //결과산출
        for (int val: mapList.keySet()) {
            if(maxValTemp < mapList.get(val)) {
                maxValTemp = mapList.get(val);
                maxCountKey = val;
            }
        }

        int duplicateCheck = 0;
        /*  map에 저장된값들중 max값을 산출한다. */
        for (int val: mapList.keySet()) {
            if(maxValTemp == mapList.get(val)) {
                duplicateCheck++;
            }
        }
        //중복이 있을경우 이면서 배열이 1개 이상인 경우
        if(duplicateCheck >=2 && array.length != 1){
            return -1;
        }

        return answer = maxCountKey;
    }




    @Test
    public void mapTest_프린트(){
        Map<Integer, Integer> mapList = new HashMap<>();
        System.out.println("put : "+mapList.put(3,2));
        System.out.println("put : "+mapList.put(4,1));
        System.out.println("put : "+mapList.put(5,1));


        System.out.println("get : "+mapList.get(3));
        System.out.println("replace : "+mapList.replace(3,6));
        System.out.println("get : "+mapList.get(3));
        System.out.println("replace3 : "+mapList.replace(3,6,8));
        System.out.println("replace3 : "+mapList.replace(3,6,9));
        System.out.println("PUT after get : "+mapList.get(3));

        System.out.println();
        System.out.println("keyset : "+mapList.keySet());
        System.out.println("keyset EQUALS containskey : "+ mapList.containsKey(3));

        System.out.println("keyset print"+"_");
        for (int val: mapList.keySet()) {
//            System.out.print(val + " _ ");
            System.out.println("value print"+"_");
            System.out.println(mapList.get(val));
        }

    }


}
