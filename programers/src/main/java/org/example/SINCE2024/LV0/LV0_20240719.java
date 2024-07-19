package org.example.SINCE2024.LV0;

public class LV0_20240719 {
    public static void main(String[] args) {

        String my_string1 = "abstract algebra"; //	"AbstrAct AlgebrA"
        String my_string2 = "PrOgRaMmErS";	        //"progrAmmers"

        System.out.println(solution1(my_string1));
        System.out.println(solution1(my_string2));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/181874
            A 강조하기

        소문자 a를 A로 변경하여 저장하도록하고, A는 A로 입력,

        a와 A 문자 이외에는 모두 소문자로 저장한다.
        끝.

     */


    public static String solution1(String myString) {
        String answer = "";
        String[] arrstr = myString.split("");

        for (int i = 0; i < arrstr.length; i++) {
            if(arrstr[i].equals("a") || arrstr[i].equals("A")){
                answer+="A";
            } else {
                answer+=arrstr[i].toLowerCase();
            }
        }
        return answer;
    }

}

