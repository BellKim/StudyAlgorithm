package org.example.SINCE2024.LV0;

public class LV0_20240504 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 15;
        System.out.println(solution2(n1));
        System.out.println(solution2(n2));



    }

/*
    https://velog.io/@skdbsqls/JavaScript-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%95%A9%EC%84%B1%EC%88%98-%EC%B0%BE%EA%B8%B0
    합성수 찾기
    숫자n을 입력받아 합성수를 찾는 로직을 구한다.
 */


    public static int solution2(int n) {
        int answer = 0;

        int hapsung = 0;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {
                if(i%k == 0){
                    hapsung += 1;
                }
            }
            if(hapsung >= 3){
                answer += 1;
            }
            hapsung = 0;
        }
        return answer;
    }





}
