package org.example.BEFORE2024.programmers_lv1;
/*
    핸드폰 번호 가리기
    https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

public class example002 {

    /*
        정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
        sol : //제일 뒤 4자리면 보이게 하고 앞엔 전부 * 처리.
        문자열의 길이를 제외한 나머지는 .replace('*') 적용.


     */


    public static void main(String[] args) {
        String input =
                "01012344321";
//                "0223334444";

        String res = "";

        res = solution(input);

        System.out.println("\nres = " + res);

    }
    static String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String [] strarr = phone_number.split("");
        for(int i=0; i<phone_number.length(); i++){
            System.out.print(strarr[i]);

            if(i<phone_number.length()-4){
                sb.append("*");
            }else{
                sb.append(strarr[i]);
            }


        }
        // System.out.println(sb.toString());
        answer = sb.toString();

        return answer;
    }

}








