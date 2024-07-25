package org.example.SINCE2024.LV0;

public class LV0_20240725 {
    public static void main(String[] args) {
        String[] strArr1 = {"AAA","BBB","CCC","DDD"};    //	["aaa","BBB","ccc","DDD"]
        String[] strArr2 = {"aBc","AbC"};   //	["abc","ABC"]
        printarr(solution1(strArr1));
        printarr(solution1(strArr2));

    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181875
        배열에서 문자열 대소문자 변환하기

        홀수번째 인덱스는 대문자,
        짝수번째 인덱스는 소문자로 변경하도록 한다.



     */
    public static String[] solution1(String[] strArr) {
        String[] answer = {};

        for (int i = 0; i < strArr.length; i++) {
            if(i == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }else if(i%2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            }else if(i%2 == 1){
                strArr[i] = strArr[i].toUpperCase();
            }else{
                System.out.println("err");
            }
        }

        answer = strArr;

        return answer;
    }

}

