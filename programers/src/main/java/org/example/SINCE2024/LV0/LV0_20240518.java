package org.example.SINCE2024.LV0;

public class LV0_20240518 {
    public static void main(String[] args) {


        System.out.println(solution1(144));
        System.out.println(solution1(976));


    }

    /*https://school.programmers.co.kr/learn/courses/30/lessons/120909
        제곱했을때 나오는 정수를 제곱수라고 합니다.
        정수n이 매개변수로 주어질때, n이 제곱수라면 1을, 아니면 2를 리턴하세요.

        제곱근을 수행하는 함수를 사용하여 나온 값이 소수점이 나올경우  정수의 제곰근이 아니라는 것이된다.
        그러므로 형변환을 통해서 확인한다.
        제곱근 나온값 double 을 int로 변경하고 다시 doubel 로 변경된다.
        double -> int -> double  의 순서대로 형변환 하면 같이 같은지 확인하면 된다.

        -------------------------------------------
        통과후 다른사람의 풀이
        나머지가 0이나 아니냐에 따라서 조건문을 추가해주면 된다.
         제곰근된 값 % 1 로 0인경우 return 1, 아닌경우 2로 리턴.
     */

    public static int solution1(int n) {
        int answer = 0;

        double val = Math.sqrt(n);

        if(val == (double)((int)val)){
            answer = 1;
        }else if(val != (double)((int)val+1)){
            answer = 2;
        }else{
            answer=0;
        }
        return answer;
    }



}
