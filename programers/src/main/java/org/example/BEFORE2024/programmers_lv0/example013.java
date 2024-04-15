package org.example.BEFORE2024.programmers_lv0;

public class example013 {

// programmers.co.kr/learn/courses/30/lessons/120841  점의 위치 구하기
//    https://school.programmers.co.kr/learn/courses/30/lessons/120841

    /*
     *
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {

//        int [] dot = {2, 4};
        int [] dot = {-7, 9};


        int res = solution(dot);



        System.out.println(res);

    }

    static int solution(int [] dot) {
        int answer= 0;

        if(dot.length == 2){
            int posx = dot[0];
            int posy = dot[1];

            if(posx > 0 && posy > 0){ // + +
                answer=1;
            }else if(posx < 0 && posy > 0){     // - +
                answer=2;
            }else if(posx < 0 && posy < 0){     // - -
                answer=3;
            }else if(posx > 0 && posy < 0){     // + -
                answer=4;
            }else{
                System.out.println("error");
            }


        }
        return answer;
    }

}
