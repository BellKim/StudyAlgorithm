package org.example.SINCE2024.LV0;



public class LV0_20240818 {
    public static void main(String[] args) {
//        str1	str2	result

        String my_string = "rermgorpsam";	int[][] queries = {{2, 3},{0, 7}, {5, 9},{6, 10}};	//"programmers"

        System.out.println(solution1(my_string, queries));
    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181913
        문자열 여러번 뒤집기
        mystring과 queries 가 주어진다.
        my_string을 이용해서  queries 의 배열속의 번호를 이용하여 문자열을 바꿔치기한다.

        [2,3] 이면 주어진문자열의 3번쨰, 4번째 문자열을 바꿔준 후 return 해주면 된다.
        가 아닌, 2~3 까지의 문자열의 순서를 뒤집는것이다.
        (단순 바꾸기가 아닌 순서 바꾸기)

        2~5 문자열이 abcd 일 경우 a와 d 만 바꾸는 것이 아닌 전체 순서를 바꾸는것.
        abcd => dcba

        첫번째 stringbuilder 를 이용하여 문자열을 입력받는다.
        두번째 stringbuilder 를 이용하여 역순을 수행해야할 문자열을 가져와서 뒤집는다. (.reverse)
        문자열이 뒤집힌 두번째 stringbuilder에서 첫번째 위치에 치환시켜준다.


     */
    public static String solution1(String my_string, int[][] queries) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {

            StringBuilder sb1 = new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1)).reverse();
            sb.replace(queries[i][0], queries[i][1]+1, sb1.toString());

            System.out.println(sb.toString());
        }


        answer = sb.toString();

        return answer;
    }


}
