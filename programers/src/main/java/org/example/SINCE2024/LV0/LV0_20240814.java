package org.example.SINCE2024.LV0;



public class LV0_20240814 {
    public static void main(String[] args) {

        String n_str1 = "0010";	//"10"
        String n_str2 =  "854020";  //	"854020"

        System.out.println(solution1(n_str1));
        System.out.println(solution1(n_str2));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181847
        0떼기
        정수로 주어진 n_str 이 주어질때 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 하는 함수를 만들어주세요.

     */

    public static String solution1(String n_str) {
        String answer = "";

        String[] strs = n_str.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.length; i++) {
            if(strs[i].equals("0") && sb.length() == 0) {

            }else{
                sb.append(strs[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }




}
