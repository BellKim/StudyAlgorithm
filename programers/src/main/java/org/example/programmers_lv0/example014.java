package org.example.programmers_lv0;

public class example014 {

//      점의 위치 구하기
//    https://school.programmers.co.kr/learn/courses/30/lessons/120816

    /*
     *
     * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
     * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
     * n명의 사람이 최소 한 조각 이상 피자를 먹으려면
     * 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     * 조각수, 사람, 피자판수
     * slice	n	result
     * 7	    10	2
     * 4	    12	3
     *
     */

    public static void main(String[] args) {


//        int slice = 7;
//        int n = 10;
        int slice = 2;
        int n = 1;

        int res = solution(slice, n);

        System.out.println("[ "+res + " ] ");

        System.out.println("테스트 코드 = " + (double)2/10 + " ////");

    }

    static int solution(int slice, int n) {
        int answer= 0;

        if(slice < n) {
            //조각수가 인원보다 많을경우
            answer = n / slice;
        }else {
            //조각수가 인원보다 적을경우 1 이하로 나눠져서 1로 포함되지 않기에 1추가.
            if((double)n/slice>0){
                answer+=1;
            }
        }

        //남은인원 존재시 1판추가.
        if(n%slice > 0 && n%slice < n ){
            answer +=1;
        }




        return answer;
    }

}
















