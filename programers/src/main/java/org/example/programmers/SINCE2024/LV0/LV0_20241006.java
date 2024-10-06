package org.example.programmers.SINCE2024.LV0;


public class LV0_20241006 {
    public static void main(String[] args) {

        int n1 = 0;	String control1 = "wsdawsdassw"; //	-1

        System.out.println(solution(n1, control1));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/181926
        수 조작하기

        "w" : n이 1 커집니다.
        "s" : n이 1 작아집니다.
        "d" : n이 10 커집니다.
        "a" : n이 10 작아집니다.

        문자열을 입력받아 문자열을 분류하여 계산된 값을 리턴 하도록한다.

     */
    public static int solution(int n, String control) {
        int wc = 0;
        int sc = 0;
        int dc = 0;
        int ac = 0;
        for (String c : control.split("")) {
            if (c.equals("w")){
                wc += 1;
            } else if (c.equals("s")) {
                sc += 1;
            } else if (c.equals("d")) {
                dc += 1;
            } else {
                ac += 1;
            }
        }
        return n + (1 * wc) - (1 * sc) + (10 * dc) - (10 * ac);
    }

}

