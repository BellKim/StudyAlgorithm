package org.example.SINCE2024.LV0;
import java.util.ArrayList;
import java.util.List;


public class LV0_20240514 {

    public static void main(String[] args) {

    }
    /*https://school.programmers.co.kr/learn/courses/30/lessons/120904?language=java
    숫자 찾기

    k 의 숫자가 나타내는 번째 수를 찾도록 하자 


     */
    public int solution(int num, int k) {
        int answer = 0;
        String num1 = Integer.toString(num);
        String[] numarr = num1.split("");

        List<String> stringList = new ArrayList<>();
        for(String n : numarr){
            stringList.add(n);
        }
        int index = 0;
        for(int i = 0; i<numarr.length; i++){
            if(Integer.toString(k).equals(numarr[i])){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}